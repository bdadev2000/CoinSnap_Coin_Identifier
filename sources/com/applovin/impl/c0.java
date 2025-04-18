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

/* loaded from: classes.dex */
public abstract class c0 extends ne {
    private com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private zb f3968b;

    /* renamed from: c, reason: collision with root package name */
    private List f3969c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3970d;

    /* renamed from: f, reason: collision with root package name */
    private ListView f3971f;

    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f3972f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f3972f = list;
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.zb
        public List c(int i10) {
            return c0.this.f3969c;
        }

        @Override // com.applovin.impl.zb
        public int d(int i10) {
            return this.f3972f.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i10) {
            return new bj("");
        }
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(List<z> list, boolean z10, com.applovin.impl.sdk.k kVar) {
        this.f3970d = z10;
        this.a = kVar;
        this.f3969c = a(list);
        a aVar = new a(this, list);
        this.f3968b = aVar;
        aVar.a(new us(this, list, kVar));
        this.f3968b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (this.f3970d) {
            str = "Selective Init ";
        } else {
            str = "";
        }
        setTitle(str.concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f3971f = listView;
        listView.setAdapter((ListAdapter) this.f3968b);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(zVar.c(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(zVar.b(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(yb.a(yb.c.DETAIL).b(StringUtils.createSpannedString(zVar.d(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.k kVar, hb hbVar, yb ybVar) {
        final z zVar = (z) list.get(hbVar.a());
        final int i10 = 1;
        if (zVar.g().size() == 1) {
            final int i11 = 0;
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new r.b() { // from class: com.applovin.impl.ft
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    int i12 = i11;
                    z zVar2 = zVar;
                    com.applovin.impl.sdk.k kVar2 = kVar;
                    switch (i12) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(zVar2, null, null, kVar2);
                            return;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(zVar2, kVar2);
                            return;
                    }
                }
            });
        } else {
            r.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, kVar.e(), new r.b() { // from class: com.applovin.impl.ft
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    int i12 = i10;
                    z zVar2 = zVar;
                    com.applovin.impl.sdk.k kVar2 = kVar;
                    switch (i12) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(zVar2, null, null, kVar2);
                            return;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(zVar2, kVar2);
                            return;
                    }
                }
            });
        }
    }
}
