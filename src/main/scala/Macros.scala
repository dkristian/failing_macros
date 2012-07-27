import scala.reflect.makro.Context
import collection.mutable.{ListBuffer,Stack}

object Macros {
/*
  def printf(format:String, params:Any*):Unit = macro printf_impl

  def printf_impl(c:Context)(format:c.Expr[String], params:c.Expr[Any]*):c.Expr[Unit] = {

    import c.mirror._
    // TOOD: Make work for general expr (eg, "%d " + "%d", ie, not a literal constant)
    val Literal(Constant(s_format:String)) = format.tree

    val evals = ListBuffer[ValDef]()
    def precompute(value:Tree, tpe:Type):Ident = {
      val freshName = newTermName(c.fresh("eval$"))
      evals += ValDef(Modifiers(), freshName, TypeTree(tpe), value)
      Ident(freshName)
    }

    val paramsStack = Stack[Tree]((params.map(_.tree)):_*)
    val refs = s_format.split("(?<=%[\\w%])|(?=%[\\w%])").map{
      case "%d" => precompute(paramsStack.pop, definitions.IntClass.asType)
      case "%s" => precompute(paramsStack.pop, definitions.StringClass.asType)
      case "%%" => Literal(Constant("%"))
      case part => Literal(Constant(part))
    }

    val stats = evals ++ refs.map(ref => c.reify(print(Expr(ref).eval)).tree)
    Expr[Unit](Block(stats.toList, Literal(Constant(()))))
  }
 */
}

