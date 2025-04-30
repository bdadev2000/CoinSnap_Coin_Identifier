package androidx.core.app;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4424a;
    public final CharSequence b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence[] f4425c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4426d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4427e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f4428f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f4429g;

    public q0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z8, int i9, Bundle bundle, HashSet hashSet) {
        this.f4424a = str;
        this.b = charSequence;
        this.f4425c = charSequenceArr;
        this.f4426d = z8;
        this.f4427e = i9;
        this.f4428f = bundle;
        this.f4429g = hashSet;
        if (i9 == 2 && !z8) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(q0 q0Var) {
        Set set;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(q0Var.f4424a).setLabel(q0Var.b).setChoices(q0Var.f4425c).setAllowFreeFormInput(q0Var.f4426d).addExtras(q0Var.f4428f);
        if (Build.VERSION.SDK_INT >= 26 && (set = q0Var.f4429g) != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                o0.d(addExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p0.b(addExtras, q0Var.f4427e);
        }
        return addExtras.build();
    }
}
