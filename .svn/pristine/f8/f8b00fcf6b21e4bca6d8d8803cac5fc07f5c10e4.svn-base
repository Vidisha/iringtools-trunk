package org.iringtools.security;

import javax.naming.Name;
import javax.naming.NameNotFoundException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.InitialDirContext;

public class LdapExchange extends InitialDirContext
{
  protected String id;
  String name;
  String description;
  String context;
  String member;
  Attributes myAttrs = new BasicAttributes(true);
  Attribute oc = new BasicAttribute("objectClass");

  public LdapExchange(String id, String name, String description, String context, 
      String member) throws NamingException
  {
    this.id = id;
    this.name = name;
    this.context = context;
    this.description = description;
    this.member = member;
    oc.add("exchange");
    myAttrs.put(oc);
    myAttrs.put("id", id);
    myAttrs.put("name", name);
    myAttrs.put("context", context);
    myAttrs.put("description", description);
    myAttrs.put("member", "");
  }

  public Attributes getAttributes(String name) throws NamingException
  {
    if (!name.equals(""))
    {
      throw new NameNotFoundException();
    }
    return (Attributes) myAttrs.clone();
  }

  public Attributes getAttributes(Name name) throws NamingException
  {
    return getAttributes(name.toString());
  }

  public Attributes getAttributes(String name, String[] ids) throws NamingException
  {
    if (!name.equals(""))
    {
      throw new NameNotFoundException();
    }

    Attributes answer = new BasicAttributes(true);
    Attribute target;
    for (int i = 0; i < ids.length; i++)
    {
      target = myAttrs.get(ids[i]);
      if (target != null)
      {
        answer.put(target);
      }
    }
    return answer;
  }

  public Attributes getAttributes(Name name, String[] ids) throws NamingException
  {
    return getAttributes(name.toString(), ids);
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public String getDescription()
  {
    return description;
  }
}
