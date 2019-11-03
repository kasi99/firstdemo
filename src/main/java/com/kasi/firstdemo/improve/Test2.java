package com.kasi.firstdemo.improve;

import javax.script.*;
import java.io.FileReader;
import java.util.Scanner;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-04-02 06:14
 * @Version:
 */

public class Test2 {
    public static void main(String[] args) throws Exception {
        /*获取JavaScript执行引擎*/
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
        /*建立上下文变量*/
        Bindings bind = engine.createBindings();
        bind.put("factor", 1);
        /*绑定上下文，作用域是当前引擎范围*/
        engine.setBindings(bind,ScriptContext.ENGINE_SCOPE);
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int first = input.nextInt();
            int sec = input.nextInt();
            engine.eval(new FileReader("D:\\Java\\Code\\workspace\\springboot\\exercise\\firstdemo\\src\\main\\java\\com\\kasi\\firstdemo\\improve\\model.js"));
            if (engine instanceof Invocable) {
                Invocable in = (Invocable) engine;
                Double formula = (Double) in.invokeFunction("formula", first, sec);
                System.out.println("运算结果："+ formula);
            }
        }
    }
}
