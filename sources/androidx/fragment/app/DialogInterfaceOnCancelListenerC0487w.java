package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tools.arruler.photomeasure.camera.ruler.R;
import g4.AbstractC2292b;
import s.C2686c;
import s.C2689f;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0487w extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private boolean mCreatingDialog;

    @Nullable
    private Dialog mDialog;
    private boolean mDismissed;
    private Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private Runnable mDismissRunnable = new RunnableC0483s(this, 0);
    private DialogInterface.OnCancelListener mOnCancelListener = new DialogInterfaceOnCancelListenerC0484t(this);
    private DialogInterface.OnDismissListener mOnDismissListener = new DialogInterfaceOnDismissListenerC0485u(this);
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private androidx.lifecycle.D mObserver = new C(this, 1);
    private boolean mDialogCreated = false;

    public final void b(boolean z8, boolean z9, boolean z10) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z9) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z10) {
                getParentFragmentManager().popBackStackImmediate(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().popBackStack(this.mBackStackId, 1, z8);
            }
            this.mBackStackId = -1;
            return;
        }
        FragmentTransaction beginTransaction = getParentFragmentManager().beginTransaction();
        beginTransaction.setReorderingAllowed(true);
        beginTransaction.remove(this);
        if (z10) {
            beginTransaction.commitNow();
        } else if (z8) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public N createFragmentContainer() {
        return new C0486v(this, super.createFragmentContainer());
    }

    public void dismiss() {
        b(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        b(true, false, false);
    }

    public void dismissNow() {
        b(false, false, true);
    }

    @Nullable
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        Object obj;
        super.onAttach(context);
        androidx.lifecycle.B viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        androidx.lifecycle.D d2 = this.mObserver;
        viewLifecycleOwnerLiveData.getClass();
        androidx.lifecycle.B.a("observeForever");
        androidx.lifecycle.A a6 = new androidx.lifecycle.A(viewLifecycleOwnerLiveData, d2);
        C2689f c2689f = viewLifecycleOwnerLiveData.b;
        C2686c b = c2689f.b(d2);
        if (b != null) {
            obj = b.f22954c;
        } else {
            C2686c c2686c = new C2686c(d2, a6);
            c2689f.f22961f++;
            C2686c c2686c2 = c2689f.f22959c;
            if (c2686c2 == null) {
                c2689f.b = c2686c;
                c2689f.f22959c = c2686c;
            } else {
                c2686c2.f22955d = c2686c;
                c2686c.f22956f = c2686c2;
                c2689f.f22959c = c2686c;
            }
            obj = null;
        }
        if (((androidx.lifecycle.A) obj) == null) {
            a6.a(true);
        }
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        boolean z8;
        super.onCreate(bundle);
        this.mHandler = new Handler();
        if (this.mContainerId == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mShowsDialog = z8;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "onCreateDialog called for DialogFragment " + this);
        }
        return new f.m(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        androidx.lifecycle.B viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        androidx.lifecycle.D d2 = this.mObserver;
        viewLifecycleOwnerLiveData.getClass();
        androidx.lifecycle.B.a("removeObserver");
        androidx.lifecycle.A a6 = (androidx.lifecycle.A) viewLifecycleOwnerLiveData.b.c(d2);
        if (a6 != null) {
            a6.a(false);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    @CallSuper
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d(FragmentManager.TAG, "onDismiss called for DialogFragment " + this);
            }
            b(true, true, false);
        }
    }

    @Nullable
    public View onFindViewById(int i9) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i9);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z8 = this.mShowsDialog;
        if (z8 && !this.mCreatingDialog) {
            if (z8 && !this.mDialogCreated) {
                try {
                    this.mCreatingDialog = true;
                    Dialog onCreateDialog = onCreateDialog(bundle);
                    this.mDialog = onCreateDialog;
                    if (this.mShowsDialog) {
                        setupDialog(onCreateDialog, this.mStyle);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.mDialog.setOwnerActivity((Activity) context);
                        }
                        this.mDialog.setCancelable(this.mCancelable);
                        this.mDialog.setOnCancelListener(this.mOnCancelListener);
                        this.mDialog.setOnDismissListener(this.mOnDismissListener);
                        this.mDialogCreated = true;
                    } else {
                        this.mDialog = null;
                    }
                    this.mCreatingDialog = false;
                } catch (Throwable th) {
                    this.mCreatingDialog = false;
                    throw th;
                }
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.d(FragmentManager.TAG, "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
            return onGetLayoutInflater;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d(FragmentManager.TAG, "mShowsDialog = false: " + str);
            } else {
                Log.d(FragmentManager.TAG, "mCreatingDialog = true: " + str);
            }
        }
        return onGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i9 = this.mStyle;
        if (i9 != 0) {
            bundle.putInt(SAVED_STYLE, i9);
        }
        int i10 = this.mTheme;
        if (i10 != 0) {
            bundle.putInt(SAVED_THEME, i10);
        }
        boolean z8 = this.mCancelable;
        if (!z8) {
            bundle.putBoolean(SAVED_CANCELABLE, z8);
        }
        boolean z9 = this.mShowsDialog;
        if (!z9) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z9);
        }
        int i11 = this.mBackStackId;
        if (i11 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            androidx.lifecycle.V.k(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC2292b.j(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.mDialog != null && bundle != null && (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            this.mDialog.onRestoreInstanceState(bundle2);
        }
    }

    @NonNull
    public final f.m requireComponentDialog() {
        Dialog requireDialog = requireDialog();
        if (requireDialog instanceof f.m) {
            return (f.m) requireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + requireDialog);
    }

    @NonNull
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z8) {
        this.mCancelable = z8;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z8);
        }
    }

    public void setShowsDialog(boolean z8) {
        this.mShowsDialog = z8;
    }

    public void setStyle(int i9, int i10) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.d(FragmentManager.TAG, "Setting style and theme for DialogFragment " + this + " to " + i9 + ", " + i10);
        }
        this.mStyle = i9;
        if (i9 == 2 || i9 == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i10 != 0) {
            this.mTheme = i10;
        }
    }

    public void setupDialog(@NonNull Dialog dialog, int i9) {
        if (i9 != 1 && i9 != 2) {
            if (i9 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.setReorderingAllowed(true);
        beginTransaction.add(this, str);
        beginTransaction.commit();
    }

    public void showNow(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.setReorderingAllowed(true);
        beginTransaction.add(this, str);
        beginTransaction.commitNow();
    }

    public int show(@NonNull FragmentTransaction fragmentTransaction, @Nullable String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        fragmentTransaction.add(this, str);
        this.mViewDestroyed = false;
        int commit = fragmentTransaction.commit();
        this.mBackStackId = commit;
        return commit;
    }
}
