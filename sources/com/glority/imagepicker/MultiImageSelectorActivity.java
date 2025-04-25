package com.glority.imagepicker;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.glority.android.ui.base.BaseActivity;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.imagepicker.MultiImageSelector;
import com.glority.imagepicker.MultiImageSelectorFragment;
import com.glority.imagepicker.bean.ResultImage;
import com.glority.imagepicker.utils.ImagePickerLogEvents;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class MultiImageSelectorActivity extends BaseActivity implements MultiImageSelectorFragment.Callback {
    private static final int DEFAULT_IMAGE_SIZE = 9;
    public static final String EXTRA_DEFAULT_SELECTED_LIST = "default_list";
    public static final String EXTRA_RESULT = "select_result";
    public static final String EXTRA_SELECT_COUNT = "max_select_count";
    public static final String EXTRA_SELECT_MODE = "select_count_mode";
    public static final String EXTRA_SHOW_CAMERA = "show_camera";
    public static final int MODE_MULTI = 1;
    public static final int MODE_SINGLE = 0;
    private static MultiImageSelector.SelectorListener selectorListener;
    private TextView mCancelButton;
    private TextView mSubmitButton;
    private int selectMode;
    private ArrayList<ResultImage> resultList = new ArrayList<>();
    private int mDefaultCount = 9;
    private boolean showCamera = true;

    public static void setSelectorListener(MultiImageSelector.SelectorListener selectorListener2) {
        selectorListener = selectorListener2;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return ImagePickerLogEvents.IMAGE_PICKER;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.mis_main_activity;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected void beforeCreate(Bundle bundle) {
        setTheme(R.style.mis_no_actionbar);
        Intent intent = getIntent();
        this.mDefaultCount = intent.getIntExtra("max_select_count", 9);
        this.selectMode = intent.getIntExtra("select_count_mode", 1);
        this.showCamera = intent.getBooleanExtra("show_camera", true);
        if (this.selectMode == 1 && intent.hasExtra("default_list")) {
            this.resultList = intent.getParcelableArrayListExtra("default_list");
        }
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle bundle) {
        this.mSubmitButton = (TextView) findViewById(R.id.commit);
        TextView textView = (TextView) findViewById(R.id.btn_cancel);
        this.mCancelButton = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.imagepicker.MultiImageSelectorActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MultiImageSelectorActivity.this.onFinish(false);
            }
        });
        if (this.selectMode == 1) {
            updateDoneText(this.resultList);
            this.mSubmitButton.setVisibility(0);
            this.mSubmitButton.setOnClickListener(new View.OnClickListener() { // from class: com.glority.imagepicker.MultiImageSelectorActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    MultiImageSelectorActivity.this.onFinish(true);
                }
            });
        } else {
            this.mSubmitButton.setVisibility(8);
        }
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("max_select_count", this.mDefaultCount);
            bundle2.putInt("select_count_mode", this.selectMode);
            bundle2.putBoolean("show_camera", this.showCamera);
            bundle2.putParcelableArrayList("default_list", this.resultList);
            getSupportFragmentManager().beginTransaction().add(R.id.image_grid, Fragment.instantiate(this, MultiImageSelectorFragment.class.getName(), bundle2)).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFinish(boolean z) {
        if (z) {
            MultiImageSelector.SelectorListener selectorListener2 = selectorListener;
            if (selectorListener2 != null) {
                selectorListener2.onResult(-1, this.resultList);
                setResult(-1);
            } else {
                Intent intent = new Intent();
                intent.putParcelableArrayListExtra("select_result", this.resultList);
                setResult(-1, intent);
            }
        } else {
            MultiImageSelector.SelectorListener selectorListener3 = selectorListener;
            if (selectorListener3 != null) {
                selectorListener3.onResult(0, null);
            }
            setResult(0);
        }
        setSelectorListener(null);
        MultiImageSelector.create().listener(null);
        finish();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onFinish(false);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    private void updateDoneText(ArrayList<ResultImage> arrayList) {
        int i;
        if (arrayList == null || arrayList.size() <= 0) {
            this.mSubmitButton.setText(R.string.mis_action_done);
            i = 0;
        } else {
            i = arrayList.size();
        }
        this.mSubmitButton.setText(getString(R.string.mis_action_button_string, new Object[]{getString(R.string.mis_action_done), Integer.valueOf(i), Integer.valueOf(this.mDefaultCount)}));
    }

    @Override // com.glority.imagepicker.MultiImageSelectorFragment.Callback
    public void onSingleImageSelected(Uri uri, PhotoFrom photoFrom) {
        this.resultList.add(new ResultImage(uri, photoFrom));
        onFinish(true);
    }

    @Override // com.glority.imagepicker.MultiImageSelectorFragment.Callback
    public void onImageSelected(Uri uri, PhotoFrom photoFrom) {
        Iterator<ResultImage> it = this.resultList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (uri.equals(it.next().imageUri)) {
                    break;
                }
            } else {
                this.resultList.add(new ResultImage(uri, photoFrom));
                break;
            }
        }
        updateDoneText(this.resultList);
    }

    @Override // com.glority.imagepicker.MultiImageSelectorFragment.Callback
    public void onImageUnselected(Uri uri) {
        int i = 0;
        while (true) {
            if (i >= this.resultList.size()) {
                i = -1;
                break;
            } else if (uri.equals(this.resultList.get(i).imageUri)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            this.resultList.remove(i);
        }
        updateDoneText(this.resultList);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        onFinish(false);
        setSelectorListener(null);
        MultiImageSelector.create().listener(null);
    }
}
