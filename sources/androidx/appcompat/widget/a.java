package androidx.appcompat.widget;

import android.text.TextUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a implements n0.s1 {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public int f799b;

    /* renamed from: c, reason: collision with root package name */
    public Object f800c;

    public a() {
        Locale locale = Locale.getDefault();
        l0.i iVar = l0.b.f21095d;
        this.a = TextUtils.getLayoutDirectionFromLocale(locale) == 1;
        this.f800c = l0.b.f21095d;
        this.f799b = 2;
    }

    @Override // n0.s1
    public final void a() {
        this.a = true;
    }

    @Override // n0.s1
    public final void b() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }

    @Override // n0.s1
    public final void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f800c;
        actionBarContextView.f677h = null;
        super/*android.view.View*/.setVisibility(this.f799b);
    }

    public final void d(int i10, byte[] bArr) {
        if (!this.a) {
            try {
                ((OutputStream) this.f800c).write(bArr, 0, i10);
                this.a = true;
            } catch (IOException e2) {
                throw new d5.a(e2);
            }
        }
    }

    public a(ActionBarContextView actionBarContextView) {
        this.f800c = actionBarContextView;
        this.a = false;
    }

    public a(OutputStream outputStream, int i10) {
        this.f800c = outputStream;
        this.f799b = i10;
    }
}
