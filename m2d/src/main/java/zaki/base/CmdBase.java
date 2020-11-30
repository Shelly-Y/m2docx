/**
 * Copyright (C), 2015-2020, phy.com
 * FileName: CmdBase
 * Author:   lingyi
 * Date:     2020/11/30 16:01
 * Description: base类
 * History:
 */
package zaki.base;

/**
 * 〈一句话接口简述〉<br> 
 * 〈base类〉
 *
 * @author zaki
 * @create 2020/11/30
 * @since 1.0.0
 */
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

//策略模式
public interface CmdBase {

    int resInfo(String[] args) throws IOException, NoSuchAlgorithmException;

}
