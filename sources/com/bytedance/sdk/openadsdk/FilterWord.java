package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FilterWord {
    private boolean KS;
    private List<FilterWord> jU;
    private String lMd;
    private String zp;

    public FilterWord(String str, String str2) {
        this.zp = str;
        this.lMd = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.jU == null) {
            this.jU = new ArrayList();
        }
        this.jU.add(filterWord);
    }

    public String getId() {
        return this.zp;
    }

    public boolean getIsSelected() {
        return this.KS;
    }

    public String getName() {
        return this.lMd;
    }

    public List<FilterWord> getOptions() {
        return this.jU;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.jU;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.zp) && !TextUtils.isEmpty(this.lMd)) {
            return true;
        }
        return false;
    }

    public void setId(String str) {
        this.zp = str;
    }

    public void setIsSelected(boolean z8) {
        this.KS = z8;
    }

    public void setName(String str) {
        this.lMd = str;
    }

    public FilterWord() {
    }
}
