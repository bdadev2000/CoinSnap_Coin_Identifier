package p2;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f23350b = p.g("SystemJobInfoConverter");
    public final ComponentName a;

    public a(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
