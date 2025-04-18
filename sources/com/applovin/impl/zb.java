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
    protected Context a;

    /* renamed from: b, reason: collision with root package name */
    private List f9362b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Map f9363c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private a f9364d;

    /* loaded from: classes.dex */
    public interface a {
        void a(hb hbVar, yb ybVar);
    }

    public zb(Context context) {
        this.a = context.getApplicationContext();
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
    public yb getItem(int i10) {
        return (yb) this.f9362b.get(i10);
    }

    public abstract List c(int i10);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new nt(this, 22));
    }

    public abstract int d(int i10);

    public abstract yb e(int i10);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9362b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return getItem(i10).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        xb xbVar;
        yb item = getItem(i10);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            xbVar = new xb();
            xbVar.a = (TextView) view.findViewById(R.id.text1);
            xbVar.f8964b = (TextView) view.findViewById(R.id.text2);
            xbVar.f8965c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            xbVar.f8966d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(xbVar);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            xbVar = (xb) view.getTag();
        }
        xbVar.a(i10);
        xbVar.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return yb.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return getItem(i10).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i10;
        this.f9362b = new ArrayList();
        int b3 = b();
        this.f9363c = new HashMap(b3);
        yb a10 = a();
        if (a10 != null) {
            this.f9362b.add(a10);
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < b3; i11++) {
            int d10 = d(i11);
            if (d10 != 0) {
                this.f9362b.add(e(i11));
                this.f9362b.addAll(c(i11));
                this.f9363c.put(Integer.valueOf(i11), Integer.valueOf(i10));
                i10 = d10 + 1 + i10;
            }
        }
        this.f9362b.add(new bj(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        xb xbVar = (xb) view.getTag();
        yb b3 = xbVar.b();
        hb a10 = a(xbVar.a());
        a aVar = this.f9364d;
        if (aVar != null && a10 != null) {
            aVar.a(a10, b3);
        }
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(r3.a(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor, this.a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }

    private hb a(int i10) {
        for (int i11 = 0; i11 < b(); i11++) {
            Integer num = (Integer) this.f9363c.get(Integer.valueOf(i11));
            if (num != null) {
                if (i10 <= num.intValue() + d(i11)) {
                    return new hb(i11, i10 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    public void a(a aVar) {
        this.f9364d = aVar;
    }
}
