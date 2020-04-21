/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Directory.Parents;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Joy
 */
public class ParentToCounselor extends WorkRequest{
    private String requestResult;
    private Parents parent;
    private String counsellorFeeback;

    public ParentToCounselor(String message, Parents parent) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.requestResult = new String();
        this.parent = parent;
        this.counsellorFeeback = new String();   
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public Parents getParent() {
        return parent;
    }

    public void setParent(Parents p) {
        this.parent = p;
    }

    public String getCounsellorFeeback() {
        return counsellorFeeback;
    }

    public void setCounsellorFeeback(String counsellorFeeback) {
        this.counsellorFeeback = counsellorFeeback;
    }
}
