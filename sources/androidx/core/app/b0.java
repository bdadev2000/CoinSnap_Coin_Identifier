package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class b0 {
    public final Bundle a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f1175b;

    /* renamed from: c, reason: collision with root package name */
    public final x1[] f1176c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1177d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1178e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1179f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1180g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1181h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f1182i;

    /* renamed from: j, reason: collision with root package name */
    public final PendingIntent f1183j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1184k;

    public b0(int i10, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, x1[] x1VarArr, x1[] x1VarArr2, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
        this(i10 == 0 ? null : IconCompat.b("", i10), charSequence, pendingIntent, bundle, x1VarArr, x1VarArr2, z10, i11, z11, z12, z13);
    }

    public b0(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, x1[] x1VarArr, x1[] x1VarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
        this.f1178e = true;
        this.f1175b = iconCompat;
        if (iconCompat != null) {
            int i11 = iconCompat.a;
            if ((i11 == -1 ? h0.c.d(iconCompat.f1279b) : i11) == 2) {
                this.f1181h = iconCompat.c();
            }
        }
        this.f1182i = s0.b(charSequence);
        this.f1183j = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.f1176c = x1VarArr;
        this.f1177d = z10;
        this.f1179f = i10;
        this.f1178e = z11;
        this.f1180g = z12;
        this.f1184k = z13;
    }
}
