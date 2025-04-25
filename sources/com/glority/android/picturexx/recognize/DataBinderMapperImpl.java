package com.glority.android.picturexx.recognize;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.recognize.databinding.ActivityCoreBindingImpl;
import com.glority.android.picturexx.recognize.databinding.ActivityGradingSnaptipsBindingImpl;
import com.glority.android.picturexx.recognize.databinding.ActivitySnapTips1BindingImpl;
import com.glority.android.picturexx.recognize.databinding.FragmentCaptureBindingImpl;
import com.glority.android.picturexx.recognize.databinding.FragmentResultBindingImpl;
import com.glority.android.picturexx.recognize.databinding.ItemMultiCaptureSmallImageBindingImpl;
import com.glority.android.picturexx.recognize.databinding.WidgetCameraZoomSelectValueViewBindingImpl;
import com.glority.android.picturexx.recognize.databinding.WidgetCameraZoomSelectViewBindingImpl;
import com.glority.android.picturexx.recognize.databinding.WidgetCameraZoomVerticalSeekBarBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ACTIVITYCORE = 1;
    private static final int LAYOUT_ACTIVITYGRADINGSNAPTIPS = 2;
    private static final int LAYOUT_ACTIVITYSNAPTIPS1 = 3;
    private static final int LAYOUT_FRAGMENTCAPTURE = 4;
    private static final int LAYOUT_FRAGMENTRESULT = 5;
    private static final int LAYOUT_ITEMMULTICAPTURESMALLIMAGE = 6;
    private static final int LAYOUT_WIDGETCAMERAZOOMSELECTVALUEVIEW = 7;
    private static final int LAYOUT_WIDGETCAMERAZOOMSELECTVIEW = 8;
    private static final int LAYOUT_WIDGETCAMERAZOOMVERTICALSEEKBAR = 9;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(9);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.activity_core, 1);
        sparseIntArray.put(R.layout.activity_grading_snaptips, 2);
        sparseIntArray.put(R.layout.activity_snap_tips1, 3);
        sparseIntArray.put(R.layout.fragment_capture, 4);
        sparseIntArray.put(R.layout.fragment_result, 5);
        sparseIntArray.put(R.layout.item_multi_capture_small_image, 6);
        sparseIntArray.put(R.layout.widget_camera_zoom_select_value_view, 7);
        sparseIntArray.put(R.layout.widget_camera_zoom_select_view, 8);
        sparseIntArray.put(R.layout.widget_camera_zoom_vertical_seek_bar, 9);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i2) {
            case 1:
                if ("layout/activity_core_0".equals(tag)) {
                    return new ActivityCoreBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_core is invalid. Received: " + tag);
            case 2:
                if ("layout/activity_grading_snaptips_0".equals(tag)) {
                    return new ActivityGradingSnaptipsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_grading_snaptips is invalid. Received: " + tag);
            case 3:
                if ("layout/activity_snap_tips1_0".equals(tag)) {
                    return new ActivitySnapTips1BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for activity_snap_tips1 is invalid. Received: " + tag);
            case 4:
                if ("layout/fragment_capture_0".equals(tag)) {
                    return new FragmentCaptureBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_capture is invalid. Received: " + tag);
            case 5:
                if ("layout/fragment_result_0".equals(tag)) {
                    return new FragmentResultBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_result is invalid. Received: " + tag);
            case 6:
                if ("layout/item_multi_capture_small_image_0".equals(tag)) {
                    return new ItemMultiCaptureSmallImageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for item_multi_capture_small_image is invalid. Received: " + tag);
            case 7:
                if ("layout/widget_camera_zoom_select_value_view_0".equals(tag)) {
                    return new WidgetCameraZoomSelectValueViewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_camera_zoom_select_value_view is invalid. Received: " + tag);
            case 8:
                if ("layout/widget_camera_zoom_select_view_0".equals(tag)) {
                    return new WidgetCameraZoomSelectViewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_camera_zoom_select_view is invalid. Received: " + tag);
            case 9:
                if ("layout/widget_camera_zoom_vertical_seek_bar_0".equals(tag)) {
                    return new WidgetCameraZoomVerticalSeekBarBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for widget_camera_zoom_vertical_seek_bar is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.apis.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.core.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.DataBinderMapperImpl());
        arrayList.add(new com.glority.base.DataBinderMapperImpl());
        return arrayList;
    }

    /* loaded from: classes5.dex */
    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        private InnerBrLookup() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* loaded from: classes5.dex */
    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(9);
            sKeys = hashMap;
            hashMap.put("layout/activity_core_0", Integer.valueOf(R.layout.activity_core));
            hashMap.put("layout/activity_grading_snaptips_0", Integer.valueOf(R.layout.activity_grading_snaptips));
            hashMap.put("layout/activity_snap_tips1_0", Integer.valueOf(R.layout.activity_snap_tips1));
            hashMap.put("layout/fragment_capture_0", Integer.valueOf(R.layout.fragment_capture));
            hashMap.put("layout/fragment_result_0", Integer.valueOf(R.layout.fragment_result));
            hashMap.put("layout/item_multi_capture_small_image_0", Integer.valueOf(R.layout.item_multi_capture_small_image));
            hashMap.put("layout/widget_camera_zoom_select_value_view_0", Integer.valueOf(R.layout.widget_camera_zoom_select_value_view));
            hashMap.put("layout/widget_camera_zoom_select_view_0", Integer.valueOf(R.layout.widget_camera_zoom_select_view));
            hashMap.put("layout/widget_camera_zoom_vertical_seek_bar_0", Integer.valueOf(R.layout.widget_camera_zoom_vertical_seek_bar));
        }
    }
}
