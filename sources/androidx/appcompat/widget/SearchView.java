package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.plantcare.ai.identifier.plantid.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements j.d {

    /* renamed from: i0, reason: collision with root package name */
    public static final i3 f751i0;
    public m3 A;
    public final Rect B;
    public final Rect C;
    public final int[] D;
    public final int[] E;
    public final ImageView F;
    public final Drawable G;
    public final int H;
    public final int I;
    public final Intent J;
    public final Intent K;
    public final CharSequence L;
    public View.OnFocusChangeListener M;
    public View.OnClickListener N;
    public boolean O;
    public boolean P;
    public u0.b Q;
    public boolean R;
    public CharSequence S;
    public boolean T;
    public boolean U;
    public int V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public CharSequence f752a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f753b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f754c0;

    /* renamed from: d0, reason: collision with root package name */
    public SearchableInfo f755d0;

    /* renamed from: e0, reason: collision with root package name */
    public Bundle f756e0;

    /* renamed from: f0, reason: collision with root package name */
    public final x2 f757f0;

    /* renamed from: g0, reason: collision with root package name */
    public final x2 f758g0;

    /* renamed from: h0, reason: collision with root package name */
    public final WeakHashMap f759h0;

    /* renamed from: r, reason: collision with root package name */
    public final SearchAutoComplete f760r;

    /* renamed from: s, reason: collision with root package name */
    public final View f761s;

    /* renamed from: t, reason: collision with root package name */
    public final View f762t;
    public final View u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f763v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f764w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f765x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f766y;

    /* renamed from: z, reason: collision with root package name */
    public final View f767z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends q {

        /* renamed from: g, reason: collision with root package name */
        public int f768g;

        /* renamed from: h, reason: collision with root package name */
        public SearchView f769h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f770i;

        /* renamed from: j, reason: collision with root package name */
        public final l3 f771j;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f771j = new l3(this);
            this.f768g = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return NotificationCompat.FLAG_LOCAL_ONLY;
            }
            if (i10 < 600) {
                if (i10 < 640 || i11 < 480) {
                    return 160;
                }
                return PsExtractor.AUDIO_STREAM;
            }
            return PsExtractor.AUDIO_STREAM;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                e3.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            i3 i3Var = SearchView.f751i0;
            i3Var.getClass();
            i3.n();
            Object obj = i3Var.f875c;
            if (((Method) obj) != null) {
                try {
                    ((Method) obj).invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f768g <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.q, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f770i) {
                l3 l3Var = this.f771j;
                removeCallbacks(l3Var);
                post(l3Var);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f769h;
            searchView.y(searchView.P);
            searchView.post(searchView.f757f0);
            if (searchView.f760r.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f769h.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f769h.hasFocus() && getVisibility() == 0) {
                boolean z11 = true;
                this.f770i = true;
                Context context = getContext();
                i3 i3Var = SearchView.f751i0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z11 = false;
                }
                if (z11) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            l3 l3Var = this.f771j;
            if (!z10) {
                this.f770i = false;
                removeCallbacks(l3Var);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.f770i = false;
                    removeCallbacks(l3Var);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.f770i = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f769h = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f768g = i10;
        }
    }

    static {
        f751i0 = Build.VERSION.SDK_INT < 29 ? new i3() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.f760r;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // j.d
    public final void b() {
        if (this.f753b0) {
            return;
        }
        this.f753b0 = true;
        SearchAutoComplete searchAutoComplete = this.f760r;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f754c0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.U = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f760r;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.U = false;
    }

    @Override // j.d
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f760r;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f752a0 = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f754c0);
        this.f753b0 = false;
    }

    public int getImeOptions() {
        return this.f760r.getImeOptions();
    }

    public int getInputType() {
        return this.f760r.getInputType();
    }

    public int getMaxWidth() {
        return this.V;
    }

    public CharSequence getQuery() {
        return this.f760r.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.S;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f755d0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f755d0.getHintId());
            }
            return this.L;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.I;
    }

    public int getSuggestionRowLayout() {
        return this.H;
    }

    public u0.b getSuggestionsAdapter() {
        return this.Q;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f752a0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f756e0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f755d0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i10;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f756e0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        } else {
            i10 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f760r;
        if (i10 >= 29) {
            e3.a(searchAutoComplete);
            return;
        }
        i3 i3Var = f751i0;
        i3Var.getClass();
        i3.n();
        Object obj = i3Var.a;
        if (((Method) obj) != null) {
            try {
                ((Method) obj).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        i3Var.getClass();
        i3.n();
        Object obj2 = i3Var.f874b;
        if (((Method) obj2) != null) {
            try {
                ((Method) obj2).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f760r;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.O) {
                clearFocus();
                y(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f757f0);
        post(this.f758g0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f760r;
            int[] iArr = this.D;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.E;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.B;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.C;
            rect2.set(i16, 0, i17, i18);
            m3 m3Var = this.A;
            if (m3Var == null) {
                m3 m3Var2 = new m3(rect2, rect, searchAutoComplete);
                this.A = m3Var2;
                setTouchDelegate(m3Var2);
            } else {
                m3Var.f938b.set(rect2);
                Rect rect3 = m3Var.f940d;
                rect3.set(rect2);
                int i19 = -m3Var.f941e;
                rect3.inset(i19, i19);
                m3Var.f939c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.P) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i12 = this.V) > 0) {
                    size = Math.min(i12, size);
                }
            } else {
                size = this.V;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i13 = this.V;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k3 k3Var = (k3) parcelable;
        super.onRestoreInstanceState(k3Var.f26666b);
        y(k3Var.f913d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k3 k3Var = new k3(super.onSaveInstanceState());
        k3Var.f913d = this.P;
        return k3Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f757f0);
    }

    public final void p(int i10) {
        int i11;
        Uri parse;
        String h10;
        Cursor cursor = this.Q.f25411d;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i12 = o3.A;
                String h11 = o3.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h11 == null) {
                    h11 = this.f755d0.getSuggestIntentAction();
                }
                if (h11 == null) {
                    h11 = "android.intent.action.SEARCH";
                }
                String h12 = o3.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h12 == null) {
                    h12 = this.f755d0.getSuggestIntentData();
                }
                if (h12 != null && (h10 = o3.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h12 = h12 + "/" + Uri.encode(h10);
                }
                if (h12 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h12);
                }
                intent = l(h11, parse, o3.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), o3.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e10) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e10);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f760r;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i10) {
        Editable text = this.f760r.getText();
        Cursor cursor = this.Q.f25411d;
        if (cursor != null) {
            if (cursor.moveToPosition(i10)) {
                String c10 = this.Q.c(cursor);
                if (c10 != null) {
                    setQuery(c10);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.U || !isFocusable()) {
            return false;
        }
        if (!this.P) {
            boolean requestFocus = this.f760r.requestFocus(i10, rect);
            if (requestFocus) {
                y(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i10, rect);
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f760r;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f755d0 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f756e0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.f760r;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.O == z10) {
            return;
        }
        this.O = z10;
        y(z10);
        v();
    }

    public void setImeOptions(int i10) {
        this.f760r.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f760r.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.V = i10;
        requestLayout();
    }

    public void setOnCloseListener(f3 f3Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(g3 g3Var) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.N = onClickListener;
    }

    public void setOnSuggestionListener(h3 h3Var) {
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.S = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i10;
        this.T = z10;
        u0.b bVar = this.Q;
        if (bVar instanceof o3) {
            o3 o3Var = (o3) bVar;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            o3Var.f981s = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r3, com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f755d0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.f760r
            r1 = 1
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f755d0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f755d0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f755d0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            u0.b r8 = r7.Q
            if (r8 == 0) goto L3e
            r8.b(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.f755d0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            androidx.appcompat.widget.o3 r8 = new androidx.appcompat.widget.o3
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f755d0
            java.util.WeakHashMap r6 = r7.f759h0
            r8.<init>(r4, r7, r5, r6)
            r7.Q = r8
            r0.setAdapter(r8)
            u0.b r8 = r7.Q
            androidx.appcompat.widget.o3 r8 = (androidx.appcompat.widget.o3) r8
            boolean r4 = r7.T
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = r1
        L63:
            r8.f981s = r4
        L65:
            r7.v()
        L68:
            android.app.SearchableInfo r8 = r7.f755d0
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.f755d0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.J
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.f755d0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.K
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.W = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.P
            r7.y(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.R = z10;
        y(this.P);
    }

    public void setSuggestionsAdapter(u0.b bVar) {
        this.Q = bVar;
        this.f760r.setAdapter(bVar);
    }

    public final void t() {
        int[] iArr;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f760r.getText());
        int i10 = 0;
        if (!z11 && (!this.O || this.f753b0)) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        ImageView imageView = this.f765x;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z11) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void u() {
        int[] iArr;
        if (this.f760r.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f762t.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.u.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z10 = this.O;
        SearchAutoComplete searchAutoComplete = this.f760r;
        if (z10 && (drawable = this.G) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        boolean z10;
        int i10 = 0;
        if ((this.R || this.W) && !this.P) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (this.f764w.getVisibility() != 0 && this.f766y.getVisibility() != 0)) {
            i10 = 8;
        }
        this.u.setVisibility(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r2.W == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.R
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.W
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.P
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.W
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f764w
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.x(boolean):void");
    }

    public final void y(boolean z10) {
        int i10;
        int i11;
        int i12;
        this.P = z10;
        int i13 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean z11 = !TextUtils.isEmpty(this.f760r.getText());
        this.f763v.setVisibility(i10);
        x(z11);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.f761s.setVisibility(i11);
        ImageView imageView = this.F;
        if (imageView.getDrawable() != null && !this.O) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        t();
        boolean z12 = !z11;
        if (this.W && !this.P && z12) {
            this.f764w.setVisibility(8);
        } else {
            i13 = 8;
        }
        this.f766y.setVisibility(i13);
        w();
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.B = new Rect();
        this.C = new Rect();
        this.D = new int[2];
        this.E = new int[2];
        int i11 = 0;
        this.f757f0 = new x2(this, i11);
        this.f758g0 = new x2(this, 1);
        this.f759h0 = new WeakHashMap();
        a3 a3Var = new a3(this);
        b3 b3Var = new b3(this);
        c3 c3Var = new c3(this);
        d3 d3Var = new d3(this, i11);
        e2 e2Var = new e2(this, 1);
        w2 w2Var = new w2(this, i11);
        int[] iArr = g.a.u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        i3 i3Var = new i3(context, obtainStyledAttributes);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        LayoutInflater.from(context).inflate(i3Var.i(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f760r = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f761s = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f762t = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.u = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f763v = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f764w = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f765x = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f766y = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.F = imageView5;
        ViewCompat.setBackground(findViewById, i3Var.e(20));
        ViewCompat.setBackground(findViewById2, i3Var.e(25));
        imageView.setImageDrawable(i3Var.e(23));
        imageView2.setImageDrawable(i3Var.e(15));
        imageView3.setImageDrawable(i3Var.e(12));
        imageView4.setImageDrawable(i3Var.e(28));
        imageView5.setImageDrawable(i3Var.e(23));
        this.G = i3Var.e(22);
        com.bumptech.glide.c.T(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.H = i3Var.i(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.I = i3Var.i(13, 0);
        imageView.setOnClickListener(a3Var);
        imageView3.setOnClickListener(a3Var);
        imageView2.setOnClickListener(a3Var);
        imageView4.setOnClickListener(a3Var);
        searchAutoComplete.setOnClickListener(a3Var);
        searchAutoComplete.addTextChangedListener(w2Var);
        searchAutoComplete.setOnEditorActionListener(c3Var);
        searchAutoComplete.setOnItemClickListener(d3Var);
        searchAutoComplete.setOnItemSelectedListener(e2Var);
        searchAutoComplete.setOnKeyListener(b3Var);
        searchAutoComplete.setOnFocusChangeListener(new y2(this));
        setIconifiedByDefault(i3Var.a(18, true));
        int d10 = i3Var.d(2, -1);
        if (d10 != -1) {
            setMaxWidth(d10);
        }
        this.L = i3Var.k(14);
        this.S = i3Var.k(21);
        int h10 = i3Var.h(6, -1);
        if (h10 != -1) {
            setImeOptions(h10);
        }
        int h11 = i3Var.h(5, -1);
        if (h11 != -1) {
            setInputType(h11);
        }
        setFocusable(i3Var.a(1, true));
        i3Var.o();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.J = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.K = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f767z = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new z2(this, 0));
        }
        y(this.O);
        v();
    }
}
