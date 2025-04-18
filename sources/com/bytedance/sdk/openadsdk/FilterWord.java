package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FilterWord {
    private List<FilterWord> AlY;
    private String Sg;
    private String YFl;
    private boolean tN;

    public FilterWord(String str, String str2) {
        this.YFl = str;
        this.Sg = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.AlY == null) {
            this.AlY = new ArrayList();
        }
        this.AlY.add(filterWord);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.YFl;
    }

    public boolean getIsSelected() {
        return this.tN;
    }

    public String getName() {
        return this.Sg;
    }

    public List<FilterWord> getOptions() {
        return this.AlY;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.AlY;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.YFl) || TextUtils.isEmpty(this.Sg)) ? false : true;
    }

    public void setId(String str) {
        this.YFl = str;
    }

    public void setIsSelected(boolean z10) {
        this.tN = z10;
    }

    public void setName(String str) {
        this.Sg = str;
    }

    public FilterWord() {
    }
}
