package Y0;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.o;

/* loaded from: classes.dex */
public final class a {
    public static final String b = o.g("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f3750a;

    public a(Context context) {
        this.f3750a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
