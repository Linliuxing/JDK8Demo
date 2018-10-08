package Javascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @Title: Test
 * @Description: ava 8引入了新的Nashorn Javascript引擎，使用它可以开发和运行JavaScript应用程序
 * @author: youqing
 * @version: 1.0
 * @date: 2018/10/6 12:08
 */
public class Test {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        System.out.println(engine.getClass().getName());
        try {
            System.out.println("output: " + engine.eval("function show() {return 10;}; show();"));
        } catch (ScriptException e) {
            e.printStackTrace();
        }

    }
}
