package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AdapterHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class OpReorderer {

    /* renamed from: a, reason: collision with root package name */
    public final Callback f21051a;

    /* loaded from: classes2.dex */
    public interface Callback {
        AdapterHelper.UpdateOp a(int i2, int i3, int i4, Object obj);

        void b(AdapterHelper.UpdateOp updateOp);
    }

    public OpReorderer(Callback callback) {
        this.f21051a = callback;
    }
}
