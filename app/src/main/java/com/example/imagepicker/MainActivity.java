package com.example.imagepicker;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.imagepicker.databinding.ActivityMainBinding;
import com.example.imagepickerutils.ImagePicker;
import com.example.imagepickerutils.cropper.CropImage;
import com.example.imagepickerutils.cropper.CropImageView;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    private ImagePicker imagePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initialization();


    }

    private void initialization() {

        imagePicker = new ImagePicker();
        imagePicker.setTitle("Select Image");
        imagePicker.setCropImage(true);
        binding.btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChooser();

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        imagePicker.onActivityResult(this, requestCode, resultCode, data);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        imagePicker.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
    }
    private void startChooser() {
        imagePicker.startChooser(this, new ImagePicker.Callback() {

            //Select picture callback
            @Override
            public void onPickImage(Uri imageUri) {

            }

            //Crop image callback
            @Override
            public void onCropImage(Uri imageUri) {
                binding.ivImage.setImageURI(imageUri);
                // binding.ivImage.getHierarchy().setRoundingParams(RoundingParams.asCircle());
            }


            //Custom crop configuration
            @Override
            public void cropConfig(CropImage.ActivityBuilder builder) {
                builder
                        //Whether to start multi-touch
                        .setMultiTouchEnabled(false)
                        //Set the grid display mode
                        .setGuidelines(CropImageView.Guidelines.ON)
                        // Circle/rectangle
                        .setCropShape(CropImageView.CropShape.RECTANGLE)
                        //Adjust the final size of the cropped image
                        .setRequestedSize(960, 960)
                        //Aspect ratio
                        .setAspectRatio(9, 9);
            }

            // User refuses authorization callback
            @Override
            public void onPermissionDenied(int requestCode, String[] permissions,
                                           int[] grantResults) {
            }
        });
    }
}
