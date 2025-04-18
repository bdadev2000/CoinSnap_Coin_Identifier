package com.mbridge.msdk.widget;

import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Calendar;

/* loaded from: classes4.dex */
public abstract class a implements View.OnClickListener {
    private long a = 0;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.a > AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
            this.a = timeInMillis;
            a(view);
        }
    }
}
