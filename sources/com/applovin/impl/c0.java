package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.dc;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class c0 extends se {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f23188a;

    /* renamed from: b, reason: collision with root package name */
    private ec f23189b;

    /* renamed from: c, reason: collision with root package name */
    private List f23190c;
    private boolean d;

    /* renamed from: f, reason: collision with root package name */
    private ListView f23191f;

    /* loaded from: classes2.dex */
    public class a extends ec {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f23192f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f23192f = list;
        }

        @Override // com.applovin.impl.ec
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.ec
        public List c(int i2) {
            return c0.this.f23190c;
        }

        @Override // com.applovin.impl.ec
        public int d(int i2) {
            return this.f23192f.size();
        }

        @Override // com.applovin.impl.ec
        public dc e(int i2) {
            return new fj("");
        }
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        return this.f23188a;
    }

    public void initialize(List<z> list, boolean z2, com.applovin.impl.sdk.j jVar) {
        this.d = z2;
        this.f23188a = jVar;
        this.f23190c = a(list);
        a aVar = new a(this, list);
        this.f23189b = aVar;
        aVar.a(new os(this, list, jVar));
        this.f23189b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.d ? "Selective Init " : "").concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f23191f = listView;
        listView.setAdapter((ListAdapter) this.f23189b);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(zVar.c(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(zVar.b(), -16777216));
            arrayList.add(dc.a(dc.c.DETAIL).b(StringUtils.createSpannedString(zVar.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.j jVar, lb lbVar, dc dcVar) {
        final z zVar = (z) list.get(lbVar.a());
        final int i2 = 1;
        if (zVar.g().size() == 1) {
            final int i3 = 0;
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, jVar.e(), new r.b() { // from class: com.applovin.impl.ts
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    int i4 = i3;
                    z zVar2 = zVar;
                    com.applovin.impl.sdk.j jVar2 = jVar;
                    switch (i4) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(zVar2, null, null, jVar2);
                            return;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(zVar2, jVar2);
                            return;
                    }
                }
            });
        } else {
            r.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, jVar.e(), new r.b() { // from class: com.applovin.impl.ts
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    int i4 = i2;
                    z zVar2 = zVar;
                    com.applovin.impl.sdk.j jVar2 = jVar;
                    switch (i4) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(zVar2, null, null, jVar2);
                            return;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(zVar2, jVar2);
                            return;
                    }
                }
            });
        }
    }
}
