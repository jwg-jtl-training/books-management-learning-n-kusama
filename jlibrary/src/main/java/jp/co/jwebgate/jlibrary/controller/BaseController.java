package jp.co.jwebgate.jlibrary.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

@Controller
public class BaseController {
    
    /**
     * エラーメッセージリストを取得
     * @param bindingResult
     * @return
     */
    public List<String> getFieldErrorMsgList(BindingResult bindingResult) {
        
        List<String> errorMsgList = new ArrayList<String>();
        
        if(bindingResult != null && bindingResult.hasFieldErrors()) {
            errorMsgList = bindingResult.getFieldErrors().
                    stream().map(e->e.getDefaultMessage()).collect(Collectors.toList());
        }
        
        return errorMsgList;
    }
}
