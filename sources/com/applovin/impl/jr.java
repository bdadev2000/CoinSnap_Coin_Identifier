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

    /* renamed from: a, reason: collision with root package name */
    private String f8496a;
    private com.applovin.impl.sdk.k b;

    /* renamed from: c, reason: collision with root package name */
    private zb f8497c;

    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f8498f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f8498f = list;
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.zb
        public List c(int i9) {
            return this.f8498f;
        }

        @Override // com.applovin.impl.zb
        public int d(int i9) {
            return this.f8498f.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i9) {
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
        return this.b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.k kVar) {
        this.f8496a = str;
        this.b = kVar;
        a aVar = new a(this, a(list));
        this.f8497c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f8496a);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f8497c);
        listView.setDividerHeight(0);
    }
}
