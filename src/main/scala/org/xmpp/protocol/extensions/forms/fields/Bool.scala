package org.xmpp
{
	package protocol.extensions.forms.fields
	{
		import scala.collection._
		import scala.xml._
		
		import org.xmpp.protocol._
		
		import org.xmpp.protocol.Protocol._
		
		object Bool
		{		
			val fieldType = FieldTypeEnumeration.Bool
			val fieldTypeName = fieldType.toString
			
			def apply(identifier:Option[String]=None, label:Option[String]=None, description:Option[String]=None, required:Boolean=false, children:Option[Seq[Node]]=None):Bool =
			{
				val xml = Field.build(Bool.fieldType, identifier, label, description, required, children)
				return apply(xml)
			}
			
			def apply(xml:Node):Bool = new Bool(xml)
		}
		
		class Bool(xml:Node) extends Field(xml, Bool.fieldType)
		{
		}
		
	}
}
