package net.karthikkompelli.mediapicker.rxjava.video;

import com.karthikkompelli.easymediapicker.video.VideoPicker;

import java.util.List;

import io.reactivex.Observable;


/**
 * Created by Alhazmy13 on 8/7/16.
 * MediaPicker
 */
public class VideoPickerHelper {
    private VideoPicker.Builder mBuilder;

    public VideoPickerHelper(VideoPicker.Builder builder) {
        this.mBuilder = builder;
    }

    public Observable<List<String>> getObservable() {
        return Observable.create(new VideoPickerObservable(mBuilder));

    }

}
