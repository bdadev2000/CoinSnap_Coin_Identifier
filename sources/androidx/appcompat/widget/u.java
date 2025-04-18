package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class u {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1041b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1042c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1043d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1044e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1045f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f1046g;

    public /* synthetic */ u(TextView textView, int i10) {
        this.a = i10;
        this.f1046g = textView;
    }

    public final void a() {
        TextView textView = this.f1046g;
        Drawable a = t0.c.a((CompoundButton) textView);
        if (a != null) {
            if (this.f1043d || this.f1044e) {
                Drawable mutate = a.mutate();
                if (this.f1043d) {
                    h0.a.h(mutate, this.f1041b);
                }
                if (this.f1044e) {
                    h0.a.i(mutate, this.f1042c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(mutate);
            }
        }
    }

    public final void b() {
        TextView textView = this.f1046g;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1043d || this.f1044e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f1043d) {
                    h0.a.h(mutate, this.f1041b);
                }
                if (this.f1044e) {
                    h0.a.i(mutate, this.f1042c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[Catch: all -> 0x009c, TryCatch #2 {all -> 0x009c, blocks: (B:5:0x0036, B:7:0x003c, B:10:0x0042, B:12:0x0057, B:14:0x005d, B:16:0x0063, B:17:0x0074, B:19:0x007a, B:20:0x0084, B:22:0x008a), top: B:4:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #2 {all -> 0x009c, blocks: (B:5:0x0036, B:7:0x003c, B:10:0x0042, B:12:0x0057, B:14:0x005d, B:16:0x0063, B:17:0x0074, B:19:0x007a, B:20:0x0084, B:22:0x008a), top: B:4:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103 A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:35:0x00bf, B:37:0x00c5, B:40:0x00cb, B:42:0x00e0, B:44:0x00e6, B:46:0x00ec, B:47:0x00fd, B:49:0x0103, B:50:0x010d, B:52:0x0113), top: B:34:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113 A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #0 {all -> 0x0125, blocks: (B:35:0x00bf, B:37:0x00c5, B:40:0x00cb, B:42:0x00e0, B:44:0x00e6, B:46:0x00ec, B:47:0x00fd, B:49:0x0103, B:50:0x010d, B:52:0x0113), top: B:34:0x00bf }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u.c(android.util.AttributeSet, int):void");
    }
}
