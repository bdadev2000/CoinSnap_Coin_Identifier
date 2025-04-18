package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.sdk.AppLovinEventTypes;
import com.plantcare.ai.identifier.plantid.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o3 extends u0.b implements View.OnClickListener {
    public static final /* synthetic */ int A = 0;

    /* renamed from: k, reason: collision with root package name */
    public final int f973k;

    /* renamed from: l, reason: collision with root package name */
    public final int f974l;

    /* renamed from: m, reason: collision with root package name */
    public final LayoutInflater f975m;

    /* renamed from: n, reason: collision with root package name */
    public final SearchView f976n;

    /* renamed from: o, reason: collision with root package name */
    public final SearchableInfo f977o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f978p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakHashMap f979q;

    /* renamed from: r, reason: collision with root package name */
    public final int f980r;

    /* renamed from: s, reason: collision with root package name */
    public int f981s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f982t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public int f983v;

    /* renamed from: w, reason: collision with root package name */
    public int f984w;

    /* renamed from: x, reason: collision with root package name */
    public int f985x;

    /* renamed from: y, reason: collision with root package name */
    public int f986y;

    /* renamed from: z, reason: collision with root package name */
    public int f987z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context);
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f974l = suggestionRowLayout;
        this.f973k = suggestionRowLayout;
        this.f975m = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f981s = 1;
        this.u = -1;
        this.f983v = -1;
        this.f984w = -1;
        this.f985x = -1;
        this.f986y = -1;
        this.f987z = -1;
        this.f976n = searchView;
        this.f977o = searchableInfo;
        this.f980r = searchView.getSuggestionCommitIconResId();
        this.f978p = context;
        this.f979q = weakHashMap;
    }

    public static String h(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    @Override // u0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o3.a(android.view.View, android.database.Cursor):void");
    }

    @Override // u0.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.u = cursor.getColumnIndex("suggest_text_1");
                this.f983v = cursor.getColumnIndex("suggest_text_2");
                this.f984w = cursor.getColumnIndex("suggest_text_2_url");
                this.f985x = cursor.getColumnIndex("suggest_icon_1");
                this.f986y = cursor.getColumnIndex("suggest_icon_2");
                this.f987z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // u0.b
    public final String c(Cursor cursor) {
        String h10;
        String h11;
        if (cursor == null) {
            return null;
        }
        String h12 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h12 != null) {
            return h12;
        }
        SearchableInfo searchableInfo = this.f977o;
        if (searchableInfo.shouldRewriteQueryFromData() && (h11 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h11;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h10 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h10;
    }

    @Override // u0.b
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f975m.inflate(this.f973k, viewGroup, false);
        inflate.setTag(new n3(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f980r);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f978p.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o3.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f978p.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // u0.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f975m.inflate(this.f974l, viewGroup, false);
            if (inflate != null) {
                ((n3) inflate.getTag()).a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // u0.b, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d10 = d(viewGroup);
            ((n3) d10.getTag()).a.setText(e2.toString());
            return d10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f25411d;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f25411d;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f976n.r((CharSequence) tag);
        }
    }
}
