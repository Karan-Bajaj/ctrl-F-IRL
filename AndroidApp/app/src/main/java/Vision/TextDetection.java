package Vision;
//
//import com.google.cloud.vision.v1.AnnotateImageRequest;
//import com.google.cloud.vision.v1.AnnotateImageResponse;
//import com.google.cloud.vision.v1.BatchAnnotateImagesResponse;
//import com.google.cloud.vision.v1.EntityAnnotation;
//import com.google.cloud.vision.v1.Feature;
//import com.google.cloud.vision.v1.Feature.Type;
//import com.google.cloud.vision.v1.Image;
//import com.google.cloud.vision.v1.ImageAnnotatorClient;
//import com.google.cloud.vision.v1.ImageSource;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TextDetection {
//
//    public static void detectTextGcs(String gcsPath) throws Exception, java.io.IOException {
//        List<AnnotateImageRequest> requests = new ArrayList<>();
//
//        ImageSource imgSrc = ImageSource.newBuilder().setGcsImageUri(gcsPath).build();
//        Image img = Image.newBuilder().setSource(imgSrc).build();
//        Feature feat = Feature.newBuilder().setType(Type.TEXT_DETECTION).build();
//        AnnotateImageRequest request =
//                AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();
//        requests.add(request);
//
//        try (ImageAnnotatorClient client = ImageAnnotatorClient.create()) {
//            BatchAnnotateImagesResponse response = client.batchAnnotateImages(requests);
//            List<AnnotateImageResponse> responses = response.getResponsesList();
//
//            for (AnnotateImageResponse res : responses) {
//                if (res.hasError()) {
//                    //out.printf("Error: %s\n", res.getError().getMessage());
//                    return;
//                }
//
//                // For full list of available annotations, see http://g.co/cloud/vision/docs
//                for (EntityAnnotation annotation : res.getTextAnnotationsList()) {
//                   // out.printf("Text: %s\n", annotation.getDescription());
//                   // out.printf("Position : %s\n", annotation.getBoundingPoly());
//                }
//            }
//        }
//    }
//}
//
