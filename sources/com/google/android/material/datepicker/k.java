package com.google.android.material.datepicker;

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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import com.google.android.material.button.MaterialButton;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes3.dex */
public final class k<S> extends s {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f11686o = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f11687c;

    /* renamed from: d, reason: collision with root package name */
    public c f11688d;

    /* renamed from: f, reason: collision with root package name */
    public n f11689f;

    /* renamed from: g, reason: collision with root package name */
    public int f11690g;

    /* renamed from: h, reason: collision with root package name */
    public android.support.v4.media.d f11691h;

    /* renamed from: i, reason: collision with root package name */
    public RecyclerView f11692i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f11693j;

    /* renamed from: k, reason: collision with root package name */
    public View f11694k;

    /* renamed from: l, reason: collision with root package name */
    public View f11695l;

    /* renamed from: m, reason: collision with root package name */
    public View f11696m;

    /* renamed from: n, reason: collision with root package name */
    public View f11697n;

    public final void b(n nVar) {
        boolean z10;
        n nVar2 = ((r) this.f11693j.getAdapter()).f11739i.f11666b;
        Calendar calendar = nVar2.f11723b;
        if (calendar instanceof GregorianCalendar) {
            int i10 = nVar.f11725d;
            int i11 = nVar2.f11725d;
            int i12 = nVar.f11724c;
            int i13 = nVar2.f11724c;
            int i14 = (i12 - i13) + ((i10 - i11) * 12);
            n nVar3 = this.f11689f;
            if (calendar instanceof GregorianCalendar) {
                int i15 = i14 - ((nVar3.f11724c - i13) + ((nVar3.f11725d - i11) * 12));
                int i16 = 3;
                boolean z11 = true;
                if (Math.abs(i15) > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i15 <= 0) {
                    z11 = false;
                }
                this.f11689f = nVar;
                if (z10 && z11) {
                    this.f11693j.scrollToPosition(i14 - 3);
                    this.f11693j.post(new j2.r(i14, i16, this));
                    return;
                } else if (z10) {
                    this.f11693j.scrollToPosition(i14 + 3);
                    this.f11693j.post(new j2.r(i14, i16, this));
                    return;
                } else {
                    this.f11693j.post(new j2.r(i14, i16, this));
                    return;
                }
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void c(int i10) {
        this.f11690g = i10;
        if (i10 == 2) {
            this.f11692i.getLayoutManager().scrollToPosition(this.f11689f.f11725d - ((w) this.f11692i.getAdapter()).f11744i.f11688d.f11666b.f11725d);
            this.f11696m.setVisibility(0);
            this.f11697n.setVisibility(8);
            this.f11694k.setVisibility(8);
            this.f11695l.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.f11696m.setVisibility(8);
            this.f11697n.setVisibility(0);
            this.f11694k.setVisibility(0);
            this.f11695l.setVisibility(0);
            b(this.f11689f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f11687c = bundle.getInt("THEME_RES_ID_KEY");
        com.applovin.impl.mediation.ads.e.n(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f11688d = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        com.applovin.impl.mediation.ads.e.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f11689f = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        e eVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f11687c);
        this.f11691h = new android.support.v4.media.d(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        n nVar = this.f11688d.f11666b;
        int i12 = 1;
        int i13 = 0;
        if (l.f(contextThemeWrapper)) {
            i10 = R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i14 = o.f11730f;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i14 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i14) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new g(this, i13));
        int i15 = this.f11688d.f11670g;
        if (i15 > 0) {
            eVar = new e(i15);
        } else {
            eVar = new e();
        }
        gridView.setAdapter((ListAdapter) eVar);
        gridView.setNumColumns(nVar.f11726f);
        gridView.setEnabled(false);
        this.f11693j = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f11693j.setLayoutManager(new h(this, getContext(), i11, i11));
        this.f11693j.setTag("MONTHS_VIEW_GROUP_TAG");
        r rVar = new r(contextThemeWrapper, this.f11688d, new y7.q(this));
        this.f11693j.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f11692i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f11692i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f11692i.setAdapter(new w(this));
            this.f11692i.addItemDecoration(new i(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.setAccessibilityDelegate(materialButton, new g(this, 2));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f11694k = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.f11695l = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f11696m = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f11697n = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            c(1);
            materialButton.setText(this.f11689f.c());
            this.f11693j.addOnScrollListener(new j(this, rVar, materialButton));
            materialButton.setOnClickListener(new h.b(this, 5));
            this.f11695l.setOnClickListener(new f(this, rVar, i12));
            this.f11694k.setOnClickListener(new f(this, rVar, i13));
        }
        if (!l.f(contextThemeWrapper)) {
            new f0().a(this.f11693j);
        }
        RecyclerView recyclerView2 = this.f11693j;
        n nVar2 = this.f11689f;
        n nVar3 = rVar.f11739i.f11666b;
        if (nVar3.f11723b instanceof GregorianCalendar) {
            recyclerView2.scrollToPosition((nVar2.f11724c - nVar3.f11724c) + ((nVar2.f11725d - nVar3.f11725d) * 12));
            ViewCompat.setAccessibilityDelegate(this.f11693j, new g(this, i12));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f11687c);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11688d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f11689f);
    }
}
