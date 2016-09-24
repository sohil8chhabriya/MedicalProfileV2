import React, {Component} from 'react';
import { Link } from 'react-router';

class DoctorProfile extends Component {
    render(){
        return(
            <div>
                Doctor
                {this.props.params.id}
            </div>
        );
    }
}

export default DoctorProfile