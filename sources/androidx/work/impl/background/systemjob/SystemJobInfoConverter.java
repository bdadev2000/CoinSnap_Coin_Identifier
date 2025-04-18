package androidx.work.impl.background.systemjob;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.NetworkType;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
class SystemJobInfoConverter {

    /* renamed from: b, reason: collision with root package name */
    public static final String f22060b = Logger.e("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f22061a;

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobInfoConverter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22062a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f22062a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22062a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22062a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22062a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22062a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SystemJobInfoConverter(Context context) {
        this.f22061a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
