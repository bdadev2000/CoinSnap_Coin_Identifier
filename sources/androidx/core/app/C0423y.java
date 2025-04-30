package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: androidx.core.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423y {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f4444a;
    public IconCompat b;

    /* renamed from: c, reason: collision with root package name */
    public final q0[] f4445c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4446d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4447e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4448f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4449g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4450h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f4451i;

    /* renamed from: j, reason: collision with root package name */
    public final PendingIntent f4452j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4453k;

    public C0423y(int i9, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q0[] q0VarArr, q0[] q0VarArr2, boolean z8, int i10, boolean z9, boolean z10, boolean z11) {
        this(i9 == 0 ? null : IconCompat.b(i9, ""), charSequence, pendingIntent, bundle, q0VarArr, q0VarArr2, z8, i10, z9, z10, z11);
    }

    public C0423y(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q0[] q0VarArr, q0[] q0VarArr2, boolean z8, int i9, boolean z9, boolean z10, boolean z11) {
        this.f4447e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i10 = iconCompat.f4455a;
            if ((i10 == -1 ? M.c.d(iconCompat.b) : i10) == 2) {
                this.f4450h = iconCompat.c();
            }
        }
        this.f4451i = O.b(charSequence);
        this.f4452j = pendingIntent;
        this.f4444a = bundle == null ? new Bundle() : bundle;
        this.f4445c = q0VarArr;
        this.f4446d = z8;
        this.f4448f = i9;
        this.f4447e = z9;
        this.f4449g = z10;
        this.f4453k = z11;
    }
}
