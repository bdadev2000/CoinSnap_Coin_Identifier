package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.WorkConstraintsTracker;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo
/* loaded from: classes3.dex */
public class ConstraintsCommandHandler {
    public static final String d = Logger.e("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f22029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22030b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkConstraintsTracker f22031c;

    public ConstraintsCommandHandler(Context context, int i2, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f22029a = context;
        this.f22030b = i2;
        this.f22031c = new WorkConstraintsTracker(context, systemAlarmDispatcher.f22044b, null);
    }
}
