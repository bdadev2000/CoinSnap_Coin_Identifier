package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class x1 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f1270b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence[] f1271c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1272d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1273e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f1274f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f1275g;

    public x1(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.f1270b = charSequence;
        this.f1271c = charSequenceArr;
        this.f1272d = z10;
        this.f1273e = i10;
        this.f1274f = bundle;
        this.f1275g = hashSet;
        if (i10 == 2 && !z10) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(x1 x1Var) {
        Set set;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(x1Var.a).setLabel(x1Var.f1270b).setChoices(x1Var.f1271c).setAllowFreeFormInput(x1Var.f1272d).addExtras(x1Var.f1274f);
        if (Build.VERSION.SDK_INT >= 26 && (set = x1Var.f1275g) != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                v1.d(addExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            w1.b(addExtras, x1Var.f1273e);
        }
        return addExtras.build();
    }
}
