package androidx.compose.material.ripple;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import java.util.ArrayList;
import java.util.LinkedHashMap;

@StabilityInferred
/* loaded from: classes4.dex */
public final class RippleContainer extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final int f7436a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7437b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7438c;
    public final RippleHostMap d;

    /* renamed from: f, reason: collision with root package name */
    public int f7439f;

    public RippleContainer(Context context) {
        super(context);
        this.f7436a = 5;
        ArrayList arrayList = new ArrayList();
        this.f7437b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f7438c = arrayList2;
        this.d = new RippleHostMap();
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.f7439f = 1;
        setTag(com.cooldev.gba.emulator.gameboy.R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RippleHostView a(RippleHostKey rippleHostKey) {
        View view;
        RippleHostMap rippleHostMap = this.d;
        RippleHostView rippleHostView = (RippleHostView) rippleHostMap.f7440a.get(rippleHostKey);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        ArrayList arrayList = this.f7438c;
        p0.a.s(arrayList, "<this>");
        RippleHostView rippleHostView2 = (RippleHostView) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = rippleHostMap.f7440a;
        LinkedHashMap linkedHashMap2 = rippleHostMap.f7441b;
        RippleHostView rippleHostView3 = rippleHostView2;
        if (rippleHostView2 == null) {
            int i2 = this.f7439f;
            ArrayList arrayList2 = this.f7437b;
            if (i2 > f0.p(arrayList2)) {
                View view2 = new View(getContext());
                addView(view2);
                arrayList2.add(view2);
                view = view2;
            } else {
                RippleHostView rippleHostView4 = (RippleHostView) arrayList2.get(this.f7439f);
                RippleHostKey rippleHostKey2 = (RippleHostKey) linkedHashMap2.get(rippleHostView4);
                view = rippleHostView4;
                if (rippleHostKey2 != null) {
                    rippleHostKey2.o1();
                    RippleHostView rippleHostView5 = (RippleHostView) linkedHashMap.get(rippleHostKey2);
                    if (rippleHostView5 != null) {
                    }
                    linkedHashMap.remove(rippleHostKey2);
                    rippleHostView4.c();
                    view = rippleHostView4;
                }
            }
            int i3 = this.f7439f;
            if (i3 < this.f7436a - 1) {
                this.f7439f = i3 + 1;
                rippleHostView3 = view;
            } else {
                this.f7439f = 0;
                rippleHostView3 = view;
            }
        }
        linkedHashMap.put(rippleHostKey, rippleHostView3);
        linkedHashMap2.put(rippleHostView3, rippleHostKey);
        return rippleHostView3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
