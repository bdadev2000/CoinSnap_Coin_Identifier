package wh;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements zh.c {
    public final h3.a a;

    /* renamed from: b, reason: collision with root package name */
    public final ki.i0 f27055b;

    /* renamed from: c, reason: collision with root package name */
    public final f f27056c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f27058e;

    public g(h this$0, h3.a editor) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(editor, "editor");
        this.f27058e = this$0;
        this.a = editor;
        ki.i0 k10 = editor.k(1);
        this.f27055b = k10;
        this.f27056c = new f(this$0, this, k10);
    }

    public final void a() {
        synchronized (this.f27058e) {
            if (this.f27057d) {
                return;
            }
            this.f27057d = true;
            xh.b.c(this.f27055b);
            try {
                this.a.a();
            } catch (IOException unused) {
            }
        }
    }
}
