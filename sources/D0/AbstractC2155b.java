package d0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2155b {

    /* renamed from: a, reason: collision with root package name */
    public static final DataBinderMapperImpl f19779a = new DataBinderMapperImpl();

    public static AbstractC2158e a(View view, int i9) {
        return f19779a.b(view, i9);
    }

    public static AbstractC2158e b(int i9, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f19779a.b(layoutInflater.inflate(i9, viewGroup, false), i9);
    }
}
