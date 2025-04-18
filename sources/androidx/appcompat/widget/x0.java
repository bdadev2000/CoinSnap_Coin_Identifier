package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class x0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f1076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typeface f1077c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1078d;

    public x0(TextView textView, Typeface typeface, int i10) {
        this.f1076b = textView;
        this.f1077c = typeface;
        this.f1078d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1076b.setTypeface(this.f1077c, this.f1078d);
    }
}
