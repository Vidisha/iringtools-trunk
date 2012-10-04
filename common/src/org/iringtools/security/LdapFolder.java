package org.iringtools.security;

import javax.naming.Name;
import javax.naming.NameNotFoundException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.InitialDirContext;

public class LdapFolder extends InitialDirContext
{
  Attributes myAttrs = new BasicAttributes(true);
  Attribute oc = new BasicAttribute("objectClass");
  String name;
  String type;
  String context;
  String description;
  String member;
  String user;
  
  public LdapFolder(String user, String name, String description, String type, 
      String context, String member) throws NamingException
  {
    this.name = name;
    this.type = type;
    this.context = context;
    this.description = description;
    this.member = member;
    this.user = user;
    oc.add("folder");
    myAttrs.put(oc);
    myAttrs.put("member", member);
    myAttrs.put("name", name);
    myAttrs.put("type", type);
    myAttrs.put("context", context);
    myAttrs.put("description", description);
    myAttrs.put("user", user);
  }  
  
  public String getName()
  {
    return name;
  }

  public String getDescription()
  {
    return description;
  }

  public String getType()
  {
    return type;
  }

  public String getContext()
  {
    return context;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setContext(String context)
  {
    this.context = context;
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
}
