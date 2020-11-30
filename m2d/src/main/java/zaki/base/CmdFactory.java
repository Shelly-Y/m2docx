/**
 * Copyright (C), 2015-2020,phy.com
 * FileName: CmdFactory
 * Author:   lingyi
 * Date:     2020/11/30 16:15
 * Description: 工厂模式创建命令执行对象
 * History:
 */
package zaki.base;

import zaki.cmd_sys.Help;

/**
 * 〈一句话功能简述〉<br> 
 * 〈工厂模式创建命令执行对象〉
 *
 * @author lingyi
 * @create 2020/11/30
 * @since 1.0.0
 */

import zaki.cmd_file.Attrib;
import zaki.cmd_file.Convert;
import zaki.cmd_file.Context;
import zaki.cmd_file.Copy;
import zaki.cmd_file.Delete;
import zaki.cmd_file.Mkdir;
import zaki.cmd_file.Move;
import zaki.cmd_file.Rename;
import zaki.cmd_file.Tree;

import zaki.cmd_sys.Help;
import zaki.cmd_sys.Version;
import zaki.cmd_sys.Start;
    //工厂模式创建命令执行对象
    public class CmdFactory {

        public static CmdBase builder(String cmdPre) {

            CmdBase cmd = null;

            //注册指令
            switch (cmdPre) {
                case "help":
                    cmd = new Help();
                    break;
                case "attrib":
                    cmd = new Attrib();
                    break;
                case "context":
                    cmd = new Context();
                    break;
                case "convert":
                    cmd = new Convert();
                    break;
                case "copy":
                    cmd = new Copy();
                    break;
                case "delete":
                    cmd = new Delete();
                    break;
                case "mkdir":
                    cmd = new Mkdir();
                    break;
                case "move":
                    cmd = new Move();
                    break;
                case "rename":
                    cmd = new Rename();
                    break;
                case "tree":
                    cmd = new Tree();
                    break;

                case "version":
                    cmd = new Version();
                    break;
                case "start":
                    cmd = new Start();
                    break;
            }
            return cmd;
        }
    }


