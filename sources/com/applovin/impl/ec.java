package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ec extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    protected Context f23676a;

    /* renamed from: b, reason: collision with root package name */
    private List f23677b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Map f23678c = new HashMap();
    private a d;

    /* loaded from: classes3.dex */
    public interface a {
        void a(lb lbVar, dc dcVar);
    }

    public ec(Context context) {
        this.f23676a = context.getApplicationContext();
    }

    public dc a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract int b();

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public dc getItem(int i2) {
        return (dc) this.f23677b.get(i2);
    }

    public abstract List c(int i2);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new mt(this, 8));
    }

    public abstract int d(int i2);

    public abstract dc e(int i2);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f23677b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i2) {
        return getItem(i2).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        cc ccVar;
        dc item = getItem(i2);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            ccVar = new cc();
            ccVar.f23264a = (TextView) view.findViewById(R.id.text1);
            ccVar.f23265b = (TextView) view.findViewById(R.id.text2);
            ccVar.f23266c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            ccVar.d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(ccVar);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            ccVar = (cc) view.getTag();
        }
        ccVar.a(i2);
        ccVar.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return dc.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i2) {
        return getItem(i2).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i2;
        this.f23677b = new ArrayList();
        int b2 = b();
        this.f23678c = new HashMap(b2);
        dc a2 = a();
        if (a2 != null) {
            this.f23677b.add(a2);
            i2 = 1;
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < b2; i3++) {
            int d = d(i3);
            if (d != 0) {
                this.f23677b.add(e(i3));
                this.f23677b.addAll(c(i3));
                this.f23678c.put(Integer.valueOf(i3), Integer.valueOf(i2));
                i2 = d + 1 + i2;
            }
        }
        this.f23677b.add(new fj(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        cc ccVar = (cc) view.getTag();
        dc b2 = ccVar.b();
        lb a2 = a(ccVar.a());
        a aVar = this.d;
        if (aVar == null || a2 == null) {
            return;
        }
        aVar.a(a2, b2);
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(t3.a(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor, this.f23676a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }

    private lb a(int i2) {
        for (int i3 = 0; i3 < b(); i3++) {
            Integer num = (Integer) this.f23678c.get(Integer.valueOf(i3));
            if (num != null) {
                if (i2 <= num.intValue() + d(i3)) {
                    return new lb(i3, i2 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }
}
