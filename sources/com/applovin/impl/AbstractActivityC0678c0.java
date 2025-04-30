package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0678c0 extends ne {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f6938a;
    private zb b;

    /* renamed from: c, reason: collision with root package name */
    private List f6939c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6940d;

    /* renamed from: f, reason: collision with root package name */
    private ListView f6941f;

    /* renamed from: com.applovin.impl.c0$a */
    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f6942f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f6942f = list;
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.zb
        public List c(int i9) {
            return AbstractActivityC0678c0.this.f6939c;
        }

        @Override // com.applovin.impl.zb
        public int d(int i9) {
            return this.f6942f.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i9) {
            return new bj("");
        }
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.f6938a;
    }

    public void initialize(List<C0781z> list, boolean z8, com.applovin.impl.sdk.k kVar) {
        this.f6940d = z8;
        this.f6938a = kVar;
        this.f6939c = a(list);
        a aVar = new a(this, list);
        this.b = aVar;
        aVar.a(new N(this, list, kVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (this.f6940d) {
            str = "Selective Init ";
        } else {
            str = "";
        }
        setTitle(str.concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f6941f = listView;
        listView.setAdapter((ListAdapter) this.b);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0781z c0781z = (C0781z) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c0781z.c(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c0781z.b(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(yb.a(yb.c.DETAIL).b(StringUtils.createSpannedString(c0781z.d(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.k kVar, hb hbVar, yb ybVar) {
        final C0781z c0781z = (C0781z) list.get(hbVar.a());
        if (c0781z.g().size() == 1) {
            final int i9 = 0;
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new r.b() { // from class: com.applovin.impl.Y
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    switch (i9) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(c0781z, null, null, kVar);
                            return;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(c0781z, kVar);
                            return;
                    }
                }
            });
        } else {
            final int i10 = 1;
            r.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, kVar.e(), new r.b() { // from class: com.applovin.impl.Y
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    switch (i10) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(c0781z, null, null, kVar);
                            return;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(c0781z, kVar);
                            return;
                    }
                }
            });
        }
    }
}
