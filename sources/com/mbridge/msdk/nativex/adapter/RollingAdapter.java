package com.mbridge.msdk.nativex.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.mbridge.msdk.nativex.view.MBNativeRollView;
import com.mbridge.msdk.out.Frame;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class RollingAdapter extends PagerAdapter {
    private List<Frame> list;
    private List<View> listview = new ArrayList();
    private MBNativeRollView.a mvinterface;

    public RollingAdapter(List<Frame> list) {
        this.list = new ArrayList();
        this.list = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i9, Object obj) {
        viewGroup.removeView(this.listview.get(i9));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.list.size();
    }

    public MBNativeRollView.a getMvinterface() {
        return this.mvinterface;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i9) {
        List<Frame> list;
        View a6;
        if (this.mvinterface != null && (list = this.list) != null && list.size() > 0 && (a6 = this.mvinterface.a(this.list.get(i9), i9)) != null) {
            this.listview.add(a6);
            viewGroup.addView(a6);
            return a6;
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void setMvinterface(MBNativeRollView.a aVar) {
        this.mvinterface = aVar;
    }
}
