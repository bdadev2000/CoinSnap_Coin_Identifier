package com.glority.android.guide.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.cmsui.entity.LikeItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeUtil.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/guide/utils/TimeUtil;", "", "()V", "getCountdownTime", "", "time", "", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TimeUtil {
    public static final TimeUtil INSTANCE = new TimeUtil();

    private TimeUtil() {
    }

    public final CharSequence getCountdownTime(long time) {
        StringBuffer stringBuffer = new StringBuffer("");
        long j = time / 3600;
        if (j < 10) {
            stringBuffer.append(LikeItem.DISLIKE + j + ':');
        } else {
            stringBuffer.append(new StringBuilder().append(j).append(':').toString());
        }
        long j2 = 60;
        long j3 = time - ((j * j2) * j2);
        long j4 = j3 / j2;
        if (j4 < 10) {
            stringBuffer.append(LikeItem.DISLIKE + j4 + ':');
        } else {
            stringBuffer.append(new StringBuilder().append(j4).append(':').toString());
        }
        long j5 = j3 - (j4 * j2);
        if (j5 < 10) {
            stringBuffer.append(Intrinsics.stringPlus(LikeItem.DISLIKE, Long.valueOf(j5)));
        } else {
            stringBuffer.append(String.valueOf(j5));
        }
        return stringBuffer;
    }
}
