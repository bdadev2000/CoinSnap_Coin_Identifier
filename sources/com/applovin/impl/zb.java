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

/* loaded from: classes.dex */
public abstract class zb extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    protected Context f12545a;
    private List b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Map f12546c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private a f12547d;

    /* loaded from: classes.dex */
    public interface a {
        void a(hb hbVar, yb ybVar);
    }

    public zb(Context context) {
        this.f12545a = context.getApplicationContext();
    }

    public yb a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract int b();

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public yb getItem(int i9) {
        return (yb) this.b.get(i9);
    }

    public abstract List c(int i9);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new F0(this, 22));
    }

    public abstract int d(int i9);

    public abstract yb e(int i9);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return i9;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i9) {
        return getItem(i9).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i9, View view, ViewGroup viewGroup) {
        xb xbVar;
        yb item = getItem(i9);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            xbVar = new xb();
            xbVar.f12165a = (TextView) view.findViewById(R.id.text1);
            xbVar.b = (TextView) view.findViewById(R.id.text2);
            xbVar.f12166c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            xbVar.f12167d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(xbVar);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            xbVar = (xb) view.getTag();
        }
        xbVar.a(i9);
        xbVar.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return yb.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i9) {
        return getItem(i9).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i9;
        this.b = new ArrayList();
        int b = b();
        this.f12546c = new HashMap(b);
        yb a6 = a();
        if (a6 != null) {
            this.b.add(a6);
            i9 = 1;
        } else {
            i9 = 0;
        }
        for (int i10 = 0; i10 < b; i10++) {
            int d2 = d(i10);
            if (d2 != 0) {
                this.b.add(e(i10));
                this.b.addAll(c(i10));
                this.f12546c.put(Integer.valueOf(i10), Integer.valueOf(i9));
                i9 = d2 + 1 + i9;
            }
        }
        this.b.add(new bj(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        xb xbVar = (xb) view.getTag();
        yb b = xbVar.b();
        hb a6 = a(xbVar.a());
        a aVar = this.f12547d;
        if (aVar != null && a6 != null) {
            aVar.a(a6, b);
        }
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(r3.a(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor, this.f12545a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }

    private hb a(int i9) {
        for (int i10 = 0; i10 < b(); i10++) {
            Integer num = (Integer) this.f12546c.get(Integer.valueOf(i10));
            if (num != null) {
                if (i9 <= num.intValue() + d(i10)) {
                    return new hb(i10, i9 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    public void a(a aVar) {
        this.f12547d = aVar;
    }
}
