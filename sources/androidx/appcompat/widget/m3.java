package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class m3 extends TouchDelegate {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f938b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f939c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f940d;

    /* renamed from: e, reason: collision with root package name */
    public final int f941e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f942f;

    public m3(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f941e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f938b = rect3;
        Rect rect4 = new Rect();
        this.f940d = rect4;
        Rect rect5 = new Rect();
        this.f939c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.a = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x10 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z11 = this.f942f;
                    this.f942f = false;
                }
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f942f;
                if (z11 && !this.f940d.contains(x10, y4)) {
                    z12 = z11;
                    z10 = false;
                }
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f938b.contains(x10, y4)) {
                this.f942f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f939c;
        View view = this.a;
        if (z10 && !rect.contains(x10, y4)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x10 - rect.left, y4 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
