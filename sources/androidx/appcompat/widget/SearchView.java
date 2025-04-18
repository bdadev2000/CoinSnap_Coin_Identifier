package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.activity.f;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import com.google.common.primitives.Ints;
import java.lang.reflect.Method;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {

    /* renamed from: n, reason: collision with root package name */
    public static final PreQAutoCompleteTextViewReflector f1185n;

    /* renamed from: a, reason: collision with root package name */
    public OnQueryTextListener f1186a;

    /* renamed from: b, reason: collision with root package name */
    public OnCloseListener f1187b;

    /* renamed from: c, reason: collision with root package name */
    public OnSuggestionListener f1188c;
    public View.OnClickListener d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1189f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1190g;

    /* renamed from: h, reason: collision with root package name */
    public CursorAdapter f1191h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f1192i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1193j;

    /* renamed from: k, reason: collision with root package name */
    public int f1194k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1195l;

    /* renamed from: m, reason: collision with root package name */
    public SearchableInfo f1196m;

    /* renamed from: androidx.appcompat.widget.SearchView$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$10, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass10 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass3 implements View.OnFocusChangeListener {
        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z2) {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass4 implements View.OnLayoutChangeListener {
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$5, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$6, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements View.OnKeyListener {
        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$7, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 implements TextView.OnEditorActionListener {
        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$8, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass8 implements AdapterView.OnItemClickListener {
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$9, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass9 implements AdapterView.OnItemSelectedListener {
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView adapterView) {
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        @DoNotInline
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @DoNotInline
        public static void b(SearchAutoComplete searchAutoComplete, int i2) {
            searchAutoComplete.setInputMethodMode(i2);
        }
    }

    @RequiresApi
    @RestrictTo
    /* loaded from: classes2.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1197a;

        /* renamed from: b, reason: collision with root package name */
        public int f1198b;

        /* renamed from: c, reason: collision with root package name */
        public int f1199c;
        public int d;
        public int e;

        public final void mapProperties(PropertyMapper propertyMapper) {
            int mapInt;
            int mapInt2;
            int mapBoolean;
            int mapObject;
            mapInt = propertyMapper.mapInt("imeOptions", R.attr.imeOptions);
            this.f1198b = mapInt;
            mapInt2 = propertyMapper.mapInt("maxWidth", R.attr.maxWidth);
            this.f1199c = mapInt2;
            mapBoolean = propertyMapper.mapBoolean("iconifiedByDefault", com.cooldev.gba.emulator.gameboy.R.attr.iconifiedByDefault);
            this.d = mapBoolean;
            mapObject = propertyMapper.mapObject("queryHint", com.cooldev.gba.emulator.gameboy.R.attr.queryHint);
            this.e = mapObject;
            this.f1197a = true;
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            SearchView searchView = (SearchView) obj;
            if (!this.f1197a) {
                throw f.e();
            }
            propertyReader.readInt(this.f1198b, searchView.getImeOptions());
            propertyReader.readInt(this.f1199c, searchView.getMaxWidth());
            propertyReader.readBoolean(this.d, searchView.f1189f);
            propertyReader.readObject(this.e, searchView.getQueryHint());
        }
    }

    /* loaded from: classes2.dex */
    public interface OnCloseListener {
    }

    /* loaded from: classes2.dex */
    public interface OnQueryTextListener {
    }

    /* loaded from: classes2.dex */
    public interface OnSuggestionListener {
    }

    /* loaded from: classes2.dex */
    public static class PreQAutoCompleteTextViewReflector {

        /* renamed from: a, reason: collision with root package name */
        public Method f1200a;

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public boolean f1201a;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1201a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1201a + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f1201a));
        }
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: a, reason: collision with root package name */
        public int f1202a;

        /* renamed from: b, reason: collision with root package name */
        public SearchView f1203b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1204c;
        public final Runnable d;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, com.cooldev.gba.emulator.gameboy.R.attr.autoCompleteTextViewStyle);
            this.d = new Runnable() { // from class: androidx.appcompat.widget.SearchView.SearchAutoComplete.1
                @Override // java.lang.Runnable
                public final void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.f1204c) {
                        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.f1204c = false;
                    }
                }
            };
            this.f1202a = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 < 960 || i3 < 720 || configuration.orientation != 2) {
                return i2 < 600 ? (i2 < 640 || i3 < 480) ? Opcodes.IF_ICMPNE : Opcodes.CHECKCAST : Opcodes.CHECKCAST;
            }
            return 256;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f1202a <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1204c) {
                Runnable runnable = this.d;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f1203b;
            searchView.f1190g = searchView.f1190g;
            throw null;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
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
                        this.f1203b.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f1203b.hasFocus() && getVisibility() == 0) {
                this.f1204c = true;
                Context context = getContext();
                PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = SearchView.f1185n;
                if (context.getResources().getConfiguration().orientation == 2) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        Api29Impl.b(this, 1);
                        if (enoughToFilter()) {
                            showDropDown();
                            return;
                        }
                        return;
                    }
                    PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector2 = SearchView.f1185n;
                    preQAutoCompleteTextViewReflector2.getClass();
                    PreQAutoCompleteTextViewReflector.a();
                    Method method = preQAutoCompleteTextViewReflector2.f1200a;
                    if (method != null) {
                        try {
                            method.invoke(this, Boolean.TRUE);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            Runnable runnable = this.d;
            if (!z2) {
                this.f1204c = false;
                removeCallbacks(runnable);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1204c = true;
                    return;
                }
                this.f1204c = false;
                removeCallbacks(runnable);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1203b = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f1202a = i2;
        }
    }

    /* loaded from: classes2.dex */
    public static class UpdatableTouchDelegate extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1206a;

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z2;
            motionEvent.getX();
            motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                throw null;
            }
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z2 = this.f1206a;
                    this.f1206a = false;
                }
                return false;
            }
            z2 = this.f1206a;
            if (z2) {
                throw null;
            }
            if (z2) {
                throw null;
            }
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.SearchView$PreQAutoCompleteTextViewReflector, java.lang.Object] */
    static {
        PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.f1200a = null;
            PreQAutoCompleteTextViewReflector.a();
            try {
                AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]).setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]).setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.f1200a = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            preQAutoCompleteTextViewReflector = obj;
        }
        f1185n = preQAutoCompleteTextViewReflector;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(com.cooldev.gba.emulator.gameboy.R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(com.cooldev.gba.emulator.gameboy.R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void a() {
        if (this.f1195l) {
            return;
        }
        this.f1195l = true;
        throw null;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void c() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1193j = true;
        super.clearFocus();
        throw null;
    }

    public int getImeOptions() {
        throw null;
    }

    public int getInputType() {
        throw null;
    }

    public int getMaxWidth() {
        return this.f1194k;
    }

    public CharSequence getQuery() {
        throw null;
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1192i;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1196m;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return null;
        }
        return getContext().getText(this.f1196m.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return 0;
    }

    public int getSuggestionRowLayout() {
        return 0;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.f1191h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        post(null);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1190g) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f1194k;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1194k;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f1194k) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(size2, Ints.MAX_POWER_OF_TWO));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1190g = savedState.f1201a;
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.appcompat.widget.SearchView$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.f1201a = this.f1190g;
        return absSavedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.f1193j || !isFocusable()) {
            return false;
        }
        if (this.f1190g) {
            return super.requestFocus(i2, rect);
        }
        throw null;
    }

    @RestrictTo
    public void setAppSearchData(Bundle bundle) {
    }

    public void setIconified(boolean z2) {
        if (z2) {
            throw null;
        }
        this.f1190g = false;
        throw null;
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f1189f == z2) {
            return;
        }
        this.f1189f = z2;
        this.f1190g = z2;
        throw null;
    }

    public void setImeOptions(int i2) {
        throw null;
    }

    public void setInputType(int i2) {
        throw null;
    }

    public void setMaxWidth(int i2) {
        this.f1194k = i2;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.f1187b = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.f1186a = onQueryTextListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
        this.f1188c = onSuggestionListener;
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.f1192i = charSequence;
        getQueryHint();
        throw null;
    }

    public void setQueryRefinementEnabled(boolean z2) {
        CursorAdapter cursorAdapter = this.f1191h;
        if (cursorAdapter instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter) cursorAdapter).f1207f = z2 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1196m = searchableInfo;
        if (searchableInfo != null) {
            searchableInfo.getSuggestThreshold();
            throw null;
        }
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled() && !this.f1196m.getVoiceSearchLaunchWebSearch()) {
            this.f1196m.getVoiceSearchLaunchRecognizer();
        }
        this.f1190g = this.f1190g;
        throw null;
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f1190g = this.f1190g;
        throw null;
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.f1191h = cursorAdapter;
        throw null;
    }
}
