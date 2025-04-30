package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.E;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.L;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class j<S> extends r {

    /* renamed from: c, reason: collision with root package name */
    public int f14026c;

    /* renamed from: d, reason: collision with root package name */
    public b f14027d;

    /* renamed from: f, reason: collision with root package name */
    public m f14028f;

    /* renamed from: g, reason: collision with root package name */
    public int f14029g;

    /* renamed from: h, reason: collision with root package name */
    public c f14030h;

    /* renamed from: i, reason: collision with root package name */
    public RecyclerView f14031i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f14032j;

    /* renamed from: k, reason: collision with root package name */
    public View f14033k;
    public View l;
    public View m;

    /* renamed from: n, reason: collision with root package name */
    public View f14034n;

    public final void b(m mVar) {
        boolean z8;
        q qVar = (q) this.f14032j.getAdapter();
        int d2 = qVar.f14070i.b.d(mVar);
        int d9 = d2 - qVar.f14070i.b.d(this.f14028f);
        boolean z9 = false;
        if (Math.abs(d9) > 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (d9 > 0) {
            z9 = true;
        }
        this.f14028f = mVar;
        if (z8 && z9) {
            this.f14032j.scrollToPosition(d2 - 3);
            this.f14032j.post(new Q.a(d2, 3, this));
        } else if (z8) {
            this.f14032j.scrollToPosition(d2 + 3);
            this.f14032j.post(new Q.a(d2, 3, this));
        } else {
            this.f14032j.post(new Q.a(d2, 3, this));
        }
    }

    public final void c(int i9) {
        this.f14029g = i9;
        if (i9 == 2) {
            this.f14031i.getLayoutManager().scrollToPosition(this.f14028f.f14059d - ((w) this.f14031i.getAdapter()).f14074i.f14027d.b.f14059d);
            this.m.setVisibility(0);
            this.f14034n.setVisibility(8);
            this.f14033k.setVisibility(8);
            this.l.setVisibility(8);
            return;
        }
        if (i9 == 1) {
            this.m.setVisibility(8);
            this.f14034n.setVisibility(0);
            this.f14033k.setVisibility(0);
            this.l.setVisibility(0);
            b(this.f14028f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f14026c = bundle.getInt("THEME_RES_ID_KEY");
        L.r(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f14027d = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        L.r(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f14028f = (m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i9;
        int i10;
        e eVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f14026c);
        this.f14030h = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        m mVar = this.f14027d.b;
        if (k.e(contextThemeWrapper, R.attr.windowFullscreen)) {
            i9 = com.tools.arruler.photomeasure.camera.ruler.R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i9 = com.tools.arruler.photomeasure.camera.ruler.R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i9, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = n.f14064f;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(com.tools.arruler.photomeasure.camera.ruler.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new Z.h(1));
        int i12 = this.f14027d.f14013g;
        if (i12 > 0) {
            eVar = new e(i12);
        } else {
            eVar = new e();
        }
        gridView.setAdapter((ListAdapter) eVar);
        gridView.setNumColumns(mVar.f14060f);
        gridView.setEnabled(false);
        this.f14032j = (RecyclerView) inflate.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.mtrl_calendar_months);
        this.f14032j.setLayoutManager(new g(this, getContext(), i10, i10));
        this.f14032j.setTag("MONTHS_VIEW_GROUP_TAG");
        q qVar = new q(contextThemeWrapper, this.f14027d, new com.bumptech.glide.f(this, 2));
        this.f14032j.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.tools.arruler.photomeasure.camera.ruler.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.mtrl_calendar_year_selector_frame);
        this.f14031i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f14031i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f14031i.setAdapter(new w(this));
            this.f14031i.addItemDecoration(new h(this));
        }
        if (inflate.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.setAccessibilityDelegate(materialButton, new B3.n(this, 4));
            View findViewById = inflate.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.month_navigation_previous);
            this.f14033k = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.month_navigation_next);
            this.l = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.m = inflate.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.mtrl_calendar_year_selector_frame);
            this.f14034n = inflate.findViewById(com.tools.arruler.photomeasure.camera.ruler.R.id.mtrl_calendar_day_selector_frame);
            c(1);
            materialButton.setText(this.f14028f.c());
            this.f14032j.addOnScrollListener(new i(this, qVar, materialButton));
            materialButton.setOnClickListener(new B3.m(this, 2));
            this.l.setOnClickListener(new f(this, qVar, 1));
            this.f14033k.setOnClickListener(new f(this, qVar, 0));
        }
        if (!k.e(contextThemeWrapper, R.attr.windowFullscreen)) {
            new E().a(this.f14032j);
        }
        this.f14032j.scrollToPosition(qVar.f14070i.b.d(this.f14028f));
        ViewCompat.setAccessibilityDelegate(this.f14032j, new Z.h(2));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f14026c);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f14027d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f14028f);
    }
}
