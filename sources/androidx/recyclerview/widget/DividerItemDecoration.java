package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class DividerItemDecoration extends S {
    private static final int[] ATTRS = {R.attr.listDivider};
    public static final int HORIZONTAL = 0;
    private static final String TAG = "DividerItem";
    public static final int VERTICAL = 1;
    private final Rect mBounds = new Rect();
    private Drawable mDivider;
    private int mOrientation;

    @SuppressLint({"UnknownNullness"})
    public DividerItemDecoration(Context context, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.mDivider = drawable;
        if (drawable == null) {
            Log.w(TAG, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        setOrientation(i9);
    }

    private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i9;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i9 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i9, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i9 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.mBounds);
            int round = Math.round(childAt.getTranslationX()) + this.mBounds.right;
            this.mDivider.setBounds(round - this.mDivider.getIntrinsicWidth(), i9, round, height);
            this.mDivider.draw(canvas);
        }
        canvas.restore();
    }

    private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i9;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i9 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i9, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i9 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.mBounds);
            int round = Math.round(childAt.getTranslationY()) + this.mBounds.bottom;
            this.mDivider.setBounds(i9, round - this.mDivider.getIntrinsicHeight(), width, round);
            this.mDivider.draw(canvas);
        }
        canvas.restore();
    }

    @Nullable
    public Drawable getDrawable() {
        return this.mDivider;
    }

    @Override // androidx.recyclerview.widget.S
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, l0 l0Var) {
        Drawable drawable = this.mDivider;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.mOrientation == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.S
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, l0 l0Var) {
        if (recyclerView.getLayoutManager() != null && this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawVertical(canvas, recyclerView);
            } else {
                drawHorizontal(canvas, recyclerView);
            }
        }
    }

    public void setDrawable(@NonNull Drawable drawable) {
        if (drawable != null) {
            this.mDivider = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public void setOrientation(int i9) {
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.mOrientation = i9;
    }
}
