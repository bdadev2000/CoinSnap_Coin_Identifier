package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class eT extends qsH {
    private long Sg;
    private long YFl;

    public eT(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public boolean AlY() {
        return this.YFl > 0 && this.Sg > 0;
    }

    public void Sg(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, int i10) {
        if (isShown()) {
            return;
        }
        Sg();
        setVisibility(0);
        this.YFl = SystemClock.elapsedRealtime();
        YFl(wwa, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qsH
    public boolean YFl() {
        return false;
    }

    public long getDisplayDuration() {
        if (this.YFl == 0) {
            return 0L;
        }
        if (this.Sg == 0) {
            this.Sg = SystemClock.elapsedRealtime();
        }
        return this.Sg - this.YFl;
    }

    public void tN() {
        setVisibility(8);
        if (this.YFl != 0) {
            this.Sg = SystemClock.elapsedRealtime();
        }
    }
}
