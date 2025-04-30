package androidx.appcompat.widget;

import B3.k;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import q.C2615o;
import q.N0;

/* loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends C2615o {

    /* renamed from: g, reason: collision with root package name */
    public int f4233g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4234h;

    /* renamed from: i, reason: collision with root package name */
    public final k f4235i;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4235i = new k(this, 21);
        this.f4233g = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i9 >= 960 && i10 >= 720 && configuration.orientation == 2) {
            return NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (i9 < 600) {
            if (i9 < 640 || i10 < 480) {
                return 160;
            }
            return PsExtractor.AUDIO_STREAM;
        }
        return PsExtractor.AUDIO_STREAM;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        if (this.f4233g > 0 && !super.enoughToFilter()) {
            return false;
        }
        return true;
    }

    @Override // q.C2615o, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f4234h) {
            k kVar = this.f4235i;
            removeCallbacks(kVar);
            post(kVar);
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z8, int i9, Rect rect) {
        super.onFocusChanged(z8, i9, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i9, KeyEvent keyEvent) {
        if (i9 == 4) {
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
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i9, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (!z8) {
        } else {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z8) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        k kVar = this.f4235i;
        if (!z8) {
            this.f4234h = false;
            removeCallbacks(kVar);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (inputMethodManager.isActive(this)) {
                this.f4234h = false;
                removeCallbacks(kVar);
                inputMethodManager.showSoftInput(this, 0);
                return;
            }
            this.f4234h = true;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i9) {
        super.setThreshold(i9);
        this.f4233g = i9;
    }

    public void setSearchView(N0 n02) {
    }
}
