import java.awt.Color;

/*
 * 创建日期 2009-10-17
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */

/**
 * @author xxzxxz
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public class State {
	Color background;
	public State(Color c)
	{
		background=c;
	}
	public void setColor(Color c)
	{
		background=c;
	}
	public Color getColor()
	{
		return background;
	}
}
