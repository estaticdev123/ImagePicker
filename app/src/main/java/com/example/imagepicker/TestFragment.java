package com.example.imagepicker;

import android.support.v4.app.Fragment;


/**
 * Created by linchaolong on 2017/3/21.
 */
public class TestFragment extends Fragment {
/*
    private ImagePicker imagePicker = new ImagePicker();
    private ImageView imageView;
    private CropImageView cropImageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_test, null);
        init(contentView);
        return contentView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        imagePicker.onActivityResult(this, requestCode, resultCode, data);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        imagePicker.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
    }

    private void init(View contentView) {
        imageView = (ImageView) contentView.findViewById(R.id.imageView);
        cropImageView = (CropImageView) contentView.findViewById(R.id.cropImageView);
        contentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCameraOrGallery();
            }
        });
    }

    private void startCameraOrGallery() {
        new AlertDialog.Builder(getActivity()).setTitle("Set Avatar")
                .setItems(new String[]{"Select an image from the album", "Take a photo"}, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        //Callback
                        ImagePicker.Callback callback = new ImagePicker.Callback() {
                            @Override
                            public void onPickImage(Uri imageUri) {
                            }

                            @Override
                            public void onCropImage(Uri imageUri) {
                                imageView.setImageURI(imageUri);
                                cropImageView.setImageUriAsync(imageUri);
                            }
                        };
                        if (which == 0) {
                            // Select an image from the album
                            imagePicker.startGallery(TestFragment.this, callback);
                        } else {
                            // Take a photo
                            imagePicker.startCamera(TestFragment.this, callback);
                        }
                    }
                })
                .show()
                .getWindow()
                .setGravity(Gravity.BOTTOM);
    }*/
}
