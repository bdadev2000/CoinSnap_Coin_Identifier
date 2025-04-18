package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.dc;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class jr extends se {

    /* renamed from: a, reason: collision with root package name */
    private String f24739a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.j f24740b;

    /* renamed from: c, reason: collision with root package name */
    private ec f24741c;

    /* loaded from: classes.dex */
    public class a extends ec {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f24742f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f24742f = list;
        }

        @Override // com.applovin.impl.ec
        public dc a() {
            return new dc.b(dc.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.ec
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.ec
        public List c(int i2) {
            return this.f24742f;
        }

        @Override // com.applovin.impl.ec
        public int d(int i2) {
            return this.f24742f.size();
        }

        @Override // com.applovin.impl.ec
        public dc e(int i2) {
            return new fj("SEGMENT TARGETING");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(dc.a(dc.c.DETAIL).d((String) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        return this.f24740b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.j jVar) {
        this.f24739a = str;
        this.f24740b = jVar;
        a aVar = new a(this, a(list));
        this.f24741c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f24739a);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f24741c);
    }
}
