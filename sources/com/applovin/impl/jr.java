package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.yb;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class jr extends ne {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f5537b;

    /* renamed from: c, reason: collision with root package name */
    private zb f5538c;

    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f5539f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f5539f = list;
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.zb
        public List c(int i10) {
            return this.f5539f;
        }

        @Override // com.applovin.impl.zb
        public int d(int i10) {
            return this.f5539f.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i10) {
            return new bj("KEYWORDS");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(yb.a(yb.c.DETAIL).d(((String) it.next()).replace("1:", "+").replace("0:", "-")).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.f5537b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.k kVar) {
        this.a = str;
        this.f5537b = kVar;
        a aVar = new a(this, a(list));
        this.f5538c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.a);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f5538c);
        listView.setDividerHeight(0);
    }
}
